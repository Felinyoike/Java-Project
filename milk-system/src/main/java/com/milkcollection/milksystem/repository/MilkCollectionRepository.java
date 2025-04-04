package com.milkcollection.milksystem.repository;

import com.milkcollection.milksystem.entity.MilkCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilkCollectionRepository extends JpaRepository<MilkCollection, Long> {
}
