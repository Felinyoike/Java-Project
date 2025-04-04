package com.milkapp.mymilkap;

import java.io.Serializable;
import java.time.LocalDate;

public class MilkCollections implements Serializable {

    private int id;
    private int farmerId;
    private double quantity;
    private LocalDate date;
    private int centerId;

    // Default constructor
    public MilkCollections() {
    }

    // Parameterized constructor
    public MilkCollections(int id, int farmerId, double quantity, LocalDate date, int centerId) {
        this.id = id;
        this.farmerId = farmerId;
        this.quantity = quantity;
        this.date = date;
        this.centerId = centerId;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCenterId() {
        return centerId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    // toString method for debugging and logging
    @Override
    public String toString() {
        return "MilkCollections{" +
                "id=" + id +
                ", farmerId=" + farmerId +
                ", quantity=" + quantity +
                ", date=" + date +
                ", centerId=" + centerId +
                '}';
    }
}
