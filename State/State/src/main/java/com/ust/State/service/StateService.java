package com.ust.State.service;

import com.ust.State.State;
import com.ust.State.dto.DistrictDto;
import com.ust.State.dto.ResponseDto;
import com.ust.State.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StateService {
    @Autowired
    private WebClient webClient;

    @Autowired
    public StateRepo stateRepo;

    public State getStateByCode(String code) {
       return  stateRepo.findByStatecode(code).get();

    }


    public ResponseDto getWithDistricts(String code){
        State state = getStateByCode(code);
        List<DistrictDto> districts = webClient.get()
                .uri("http://localhost:9011/districts/"+code)
                .retrieve()
                .bodyToFlux(DistrictDto.class).
                collect(Collectors.toList())
                .block();

        ResponseDto responseDto = new ResponseDto();
        responseDto.setState(state);
        responseDto.setDistricts(districts);
        return responseDto;
    }



}
