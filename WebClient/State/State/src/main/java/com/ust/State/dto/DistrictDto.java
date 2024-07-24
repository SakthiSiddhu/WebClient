package com.ust.State.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictDto
{

    private Integer id;
    private String name;
    private String stateCode;
    private String capital;
    private String touristPlaces;
    private String languageSpoken;
    private String climate;
}
