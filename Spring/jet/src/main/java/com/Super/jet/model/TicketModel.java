package com.Super.jet.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Ticket")
public class TicketModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int trip_id;
    String passenger_name;
    String seat_number;


}
