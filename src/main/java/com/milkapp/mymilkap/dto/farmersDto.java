package com.milkapp.mymilkap.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class farmersDto {
    private Long id;
    private String name;
    private Integer contact;
    private String farm_details;
}
