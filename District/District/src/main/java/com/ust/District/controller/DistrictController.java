package com.ust.District.controller;

import com.ust.District.model.District;
import com.ust.District.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/districts")
public class DistrictController {

    @Autowired
     DistrictService districtService;

    @GetMapping("/{statecode}")
    public List<District> getDistrictsByStateCode(@PathVariable String statecode) {
        return districtService.getByStateCode(statecode);
    }
}
