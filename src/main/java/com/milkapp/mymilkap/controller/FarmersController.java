package com.milkapp.mymilkap.controller;

import com.milkapp.mymilkap.dto.farmersDto;
import com.milkapp.mymilkap.service.farmersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/farmers")
public class FarmersController {

    @Autowired
    private farmersService farmersService;

    //Build Add Farmers REST API
    @PostMapping
    public ResponseEntity<farmersDto> createFarmers(@RequestBody farmersDto farmersDto) {
        farmersDto savedFarmers = farmersService.Createfarmers(farmersDto);
        return new ResponseEntity<>(savedFarmers, HttpStatus.CREATED);
    }

    //BuildGet Farmer REST API
    @GetMapping("/{id}")
    public ResponseEntity<farmersDto> getfarmersById(@PathVariable("id") Long farmersId) {
        farmersDto farmersDto = farmersService.getfarmersById(farmersId);
        return ResponseEntity.ok(farmersDto);
    }
}
