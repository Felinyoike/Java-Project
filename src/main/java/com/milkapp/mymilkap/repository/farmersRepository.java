package com.milkapp.mymilkap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milkapp.mymilkap.entity.farmers;


public interface FarmersRepository extends JpaRepository<farmers, Long> {
}
