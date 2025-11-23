package com.Super.jet.controller;

import com.Super.jet.model.TripModel;
import com.Super.jet.repo.TripRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
@CrossOrigin(origins = "http://localhost:4200")
public class TripController {

    private final TripRepo tripRepo;

    public TripController(TripRepo tripRepo) {
        this.tripRepo = tripRepo;
    }

    @GetMapping("/get")
    public List<TripModel> getTrips() { // Changed from getBuses to getTrips
        return tripRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public TripModel getTrip(@PathVariable("id") int id) { // Changed from getBuses to getTrip
        return tripRepo.findById(id).orElse(null); // Return null instead of new TripModel(null)
    }

    @PostMapping("/post")
    public TripModel addTrip(@RequestBody TripModel tripModel) { // Changed from addBus to addTrip
        tripModel.setId(null); // Set ID to null for new trips
        return tripRepo.save(tripModel);
    }

    @PutMapping("/put")
    public TripModel updateTrip(@RequestBody TripModel tripModel) { // Changed from updateBus to updateTrip
        if (tripModel.getId() != null && tripRepo.existsById(tripModel.getId())) {
            return tripRepo.save(tripModel);
        }
        throw new RuntimeException("Trip not found with id: " + tripModel.getId());
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTrip(@PathVariable("id") int id) { // Changed from deleteBus to deleteTrip
        if (tripRepo.existsById(id)) {
            tripRepo.deleteById(id);
            return "Trip deleted successfully";
        }
        throw new RuntimeException("Trip not found with id: " + id);
    }
}