package com.Super.jet.controller;

import com.Super.jet.model.RouteModel;
import com.Super.jet.model.TicketModel;
import com.Super.jet.repo.RouteRepo;
import com.Super.jet.repo.TicketRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    TicketRepo ticketRepo;
    public TicketController(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    @GetMapping("/get")
    public List<TicketModel> getBuses() {
        return ticketRepo.findAll();
    }
    @GetMapping("/get/{i}")
    public TicketModel getBuses(@PathVariable int i ) {
        return ticketRepo.findById(i).orElse(null);
    }
    @PostMapping("/post")
    public void addBus(@RequestBody TicketModel ticketModel) {
        ticketRepo.save(ticketModel);
    }
    @PutMapping("/put")
    public void updateBus(@RequestBody TicketModel ticketModel) {
        ticketRepo.save(ticketModel);
    }
    @DeleteMapping("/delete")
    public void deleteBus(@RequestBody TicketModel ticketModel) {
        ticketRepo.delete(ticketModel);
    }
}
