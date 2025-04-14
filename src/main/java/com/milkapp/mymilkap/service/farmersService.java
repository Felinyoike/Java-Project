package com.milkapp.mymilkap.service;

import com.milkapp.mymilkap.dto.farmersDto;

public interface farmersService {
    farmersDto Createfarmers(farmersDto farmersDto);

    farmersDto getfarmersById(Long farmersId);
}
