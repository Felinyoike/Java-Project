package com.milkcollection.milksystem.service;

import com.milkcollection.milksystem.entity.MilkCollection;
import com.milkcollection.milksystem.repository.MilkCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilkCollectionService {

    @Autowired
    private MilkCollectionRepository repository;

    public MilkCollection save(MilkCollection milkCollection) {
        return repository.save(milkCollection);
    }

    public List<MilkCollection> getAll() {
        return repository.findAll();
    }
}
