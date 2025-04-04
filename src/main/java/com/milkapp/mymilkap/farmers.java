package com.milkapp.mymilkap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class farmers {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/milkapp"; // Replace with your database URL
    private static final String DB_USER = "root"; // Replace with your database username
    private static final String DB_PASSWORD = "password"; // Replace with your database password

    // Farmer class to represent a farmer record
    public static class Farmer {
        private int id;
        private String name;
        private String address;

        public Farmer(int id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Farmer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    // Method to fetch all farmers from the database
    public List<Farmer> getAllFarmers() {
        List<Farmer> farmersList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM farmers")) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                farmersList.add(new Farmer(id, name, address));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return farmersList;
    }

    // Main method for testing
    public static void main(String[] args) {
        farmers farmersObj = new farmers();
        List<Farmer> farmers = farmersObj.getAllFarmers();
        for (Farmer farmer : farmers) {
            System.out.println(farmer);
        }
    }
}
