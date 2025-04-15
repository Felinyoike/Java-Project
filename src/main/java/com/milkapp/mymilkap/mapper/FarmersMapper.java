package com.milkapp.mymilkap.mapper;

import com.milkapp.mymilkap.dto.farmersDto;
import com.milkapp.mymilkap.entity.farmers;

public class FarmersMapper {
    public static farmersDto mapTofarmersDto(farmers farmers){
        return new farmersDto(
          farmers.getId(),
          farmers.getName(),
            farmers.getContact(),
            farmers.getFarm_details()  
        );
    }

    public static farmers mapTofarmers(farmersDto farmersDto){
        return new farmers(
            farmersDto.getId(),
            farmersDto.getName(),
            farmersDto.getContact(),
            farmersDto.getFarm_details()
        );
    }
}
