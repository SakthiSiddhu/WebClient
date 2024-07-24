package com.ust.District.service;

import com.ust.District.model.District;
import com.ust.District.repository.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    public DistrictRepo districtRepository;

    public List<District> getByStateCode(String code) {
        return districtRepository.findByStateCode(code).orElseThrow(
                () -> new RuntimeException("District not found"));
    }

}
