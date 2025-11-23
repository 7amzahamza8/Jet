package com.Super.jet.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Country")
@Data
public class CountryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String country_name;

    public CountryModel() {
    }
    public CountryModel(Object o) {
    }
}

