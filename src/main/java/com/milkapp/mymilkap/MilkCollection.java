package com.milkapp.mymilkap;

import java.time.LocalDate;
import java.util.List;

public interface MilkCollection {

    /**
     * Add a new milk collection record.
     *
     * @param farmerId The ID of the farmer.
     * @param quantity The quantity of milk collected.
     * @param date The date of the collection.
     * @param centerId The ID of the collection center.
     * @return true if the record was successfully added, false otherwise.
     */
    boolean addMilkCollection(int farmerId, double quantity, LocalDate date, int centerId);

    /**
     * Retrieve all milk collection records.
     *
     * @return A list of all milk collection records.
     */
    List<MilkCollections> getAllMilkCollections();

    /**
     * Retrieve milk collection records for a specific farmer.
     *
     * @param farmerId The ID of the farmer.
     * @return A list of milk collection records for the specified farmer.
     */
    List<MilkCollections> getMilkCollectionsByFarmer(int farmerId);

    /**
     * Retrieve milk collection records for a specific date.
     *
     * @param date The date of the milk collection.
     * @return A list of milk collection records for the specified date.
     */
    List<MilkCollections> getMilkCollectionsByDate(LocalDate date);

    /**
     * Update a milk collection record.
     *
     * @param id The ID of the milk collection record to update.
     * @param quantity The new quantity of milk collected.
     * @return true if the record was successfully updated, false otherwise.
     */
    boolean updateMilkCollection(int id, double quantity);

    /**
     * Delete a milk collection record.
     *
     * @param id The ID of the milk collection record to delete.
     * @return true if the record was successfully deleted, false otherwise.
     */
    boolean deleteMilkCollection(int id);
}
