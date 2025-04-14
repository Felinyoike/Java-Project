package com.milkapp.mymilkap.service.Impl;

import com.milkapp.mymilkap.dto.farmersDto;
import com.milkapp.mymilkap.entity.farmers;
import com.milkapp.mymilkap.exception.ResourceNotFoundException;
import com.milkapp.mymilkap.mapper.FarmersMapper;
import com.milkapp.mymilkap.repository.FarmersRepository;
import com.milkapp.mymilkap.service.farmersService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class farmersServiceImpl implements farmersService {

    private FarmersRepository farmersRepository;
    @Override
    public farmersDto Createfarmers(farmersDto farmersDto) {

        farmers farmers = FarmersMapper.mapTofarmers(farmersDto);
        farmers savedfarmer = farmersRepository.save(farmers);

        return FarmersMapper.mapTofarmersDto(savedfarmer);
    }

    @Override
    public farmersDto getfarmersById(Long farmersId) {
        farmers farmers = farmersRepository.findById(farmersId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Farmer not found: " + farmersId));
        return FarmersMapper.mapTofarmersDto(farmers);
    }
}
