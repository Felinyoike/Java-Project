package com.milkapp.mymilkap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MilkCollectionRepository extends JpaRepository<MilkCollections, Integer> {

    /**
     * Find all milk collection records for a specific farmer.
     *
     * @param farmerId The ID of the farmer.
     * @return A list of milk collection records for the specified farmer.
     */
    List<MilkCollections> findByFarmerId(int farmerId);

    /**
     * Find all milk collection records for a specific date.
     *
     * @param date The date of the milk collection.
     * @return A list of milk collection records for the specified date.
     */
    List<MilkCollections> findByDate(LocalDate date);

    /**
     * Find all milk collection records for a specific collection center.
     *
     * @param centerId The ID of the collection center.
     * @return A list of milk collection records for the specified center.
     */
    List<MilkCollections> findByCenterId(int centerId);

    /**
     * Find all milk collection records for a specific farmer and date.
     *
     * @param farmerId The ID of the farmer.
     * @param date The date of the milk collection.
     * @return A list of milk collection records for the specified farmer and date.
     */
    List<MilkCollections> findByFarmerIdAndDate(int farmerId, LocalDate date);

    /**
     * Find all milk collection records for a specific collection center and date.
     *
     * @param centerId The ID of the collection center.
     * @param date The date of the milk collection.
     * @return A list of milk collection records for the specified center and date.
     */
    List<MilkCollections> findByCenterIdAndDate(int centerId, LocalDate date);
}
