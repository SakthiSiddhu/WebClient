package com.ust.District.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {

    @Id
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "stateCode")
    @NotNull
    private String stateCode;

    @Column(name = "capital")
    private String capital;

    @Column(name = "touristPlaces")
    private String touristPlaces;

    @Column(name = "languageSpoken")
    private String languageSpoken;

    @Column(name = "climate")
    private String climate;
}