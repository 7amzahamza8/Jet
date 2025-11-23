package com.Super.jet.controller;

import com.Super.jet.model.BusModel;
import com.Super.jet.model.CountryModel;
import com.Super.jet.repo.BusRepo;
import com.Super.jet.repo.CountryRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
//@CrossOrigin(origins = "http://localhost:4200") // Add this line

public class CountryController {

    CountryRepo countryRepo;
    public CountryController(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    @GetMapping("/get")
    public List<CountryModel> getBuses() {
        return countryRepo.findAll();
    }
    @GetMapping("/get/{i}")
    public CountryModel getBuses(@PathVariable int i ) {
        return countryRepo.findById(i).orElse(new CountryModel(null));
    }
    @PostMapping("/post")
    public void addBus(@RequestBody CountryModel countryModel) {
        countryRepo.save(countryModel);
    }
    @PutMapping("/put")
    public void updateBus(@RequestBody CountryModel countryModel) {
        countryRepo.save(countryModel);
    }
    @DeleteMapping("/delete")
    public void deleteBus(@RequestBody CountryModel countryModel) {
        countryRepo.delete(countryModel);
    }
}
