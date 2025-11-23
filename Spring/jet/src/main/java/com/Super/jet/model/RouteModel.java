package com.Super.jet.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Route")
@Data
@NoArgsConstructor
public class RouteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String from_location;
    private String to_location;

    // Remove the Object constructor as it confuses Jackson
    // Keep only the default no-args constructor (provided by @NoArgsConstructor)

    // Optional: You can add a constructor for creating with specific values
    public RouteModel(String from_location, String to_location) {
        this.from_location = from_location;
        this.to_location = to_location;
    }
}