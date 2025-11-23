package com.Super.jet.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Table(name = "Trip")
@Data
@NoArgsConstructor
public class TripModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Changed from int to Integer

    private Integer bus_id; // Changed from int to Integer
    private Integer route_id; // Changed from int to Integer

    @Temporal(TemporalType.TIMESTAMP)
    private Date arrival_time;

    // Remove the Object constructor to avoid Jackson issues
    // Keep only the default constructor (provided by @NoArgsConstructor)

    // Optional constructor for creating with specific values
    public TripModel(Integer bus_id, Integer route_id, Date arrival_time) {
        this.bus_id = bus_id;
        this.route_id = route_id;
        this.arrival_time = arrival_time;
    }
}