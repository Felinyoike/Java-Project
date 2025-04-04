package com.milkapp.mymilkap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Integer> {
    // Additional query methods can be defined here if needed
}
