package com.ust.State;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {

    @Id
    private Long id;
    private String name;
    private String statecode;
    private Double latitude;
    private Double longitude;
    private Integer numberofdistricts;
    private String capital;
    private Double area;
    private Long population;


}