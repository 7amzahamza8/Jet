package com.Super.jet.controller;

import com.Super.jet.model.BusModel;
import com.Super.jet.repo.BusRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
@CrossOrigin(origins = "http://localhost:4200") // Add this line

public class BusController {
    BusRepo busRepo;
    public BusController(BusRepo busRepo) {
        this.busRepo = busRepo;
    }

    @GetMapping("/get")
    public List<BusModel> getBuses() {
       return busRepo.findAll();
    }
    @GetMapping("/get/{i}")
    public BusModel getBuses(@PathVariable int i ) {
        return busRepo.findById(i).orElse(new BusModel(null));
    }

    @PostMapping("/post")
    public void addBus(@RequestBody BusModel busModel) {
        busRepo.save(busModel);
    }
    @PutMapping("/put")
    public void updateBus(@RequestBody BusModel busModel) {
        busRepo.save(busModel);
    }
    @DeleteMapping("/delete")
    public void deleteBus(@RequestBody BusModel busModel) {
        busRepo.delete(busModel);
    }

}
