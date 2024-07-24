package com.ust.State.controller;

import com.ust.State.State;
import com.ust.State.dto.ResponseDto;
import com.ust.State.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("/{code}")
    public State getState(String code){
        return stateService.getStateByCode(code);
    }

    @GetMapping("/withdistricts/{code}")
    public ResponseDto getWithDistricts(String code){
        return stateService.getWithDistricts(code);
    }
}
