package com.milkcollection.milksystem.controller;

import com.milkcollection.milksystem.entity.MilkCollection;
import com.milkcollection.milksystem.service.MilkCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/collections")
@CrossOrigin("*") // Allow frontend to access the API
public class MilkCollectionController {

    @Autowired
    private MilkCollectionService service;

    @PostMapping
    public MilkCollection create(@RequestBody MilkCollection milkCollection) {
        return service.save(milkCollection);
    }

    @GetMapping
    public List<MilkCollection> getAll() {
        return service.getAll();
    }
}
