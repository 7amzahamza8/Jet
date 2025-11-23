package com.Super.jet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BUS")
@Data
@NoArgsConstructor

public class BusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String plate_number ;
    String marque;
    String type ;
    int capacity;

    public BusModel(Object o) {
    }
}