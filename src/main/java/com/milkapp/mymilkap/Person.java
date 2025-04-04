package com.milkapp.mymilkap;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "farmers")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
