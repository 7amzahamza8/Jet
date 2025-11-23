package com.Super.jet.controller;

import com.Super.jet.model.RouteModel;
import com.Super.jet.repo.RouteRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/route")
@CrossOrigin(origins = "http://localhost:4200")
public class RouteController {

    private final RouteRepo routeRepo;

    public RouteController(RouteRepo routeRepo) {
        this.routeRepo = routeRepo;
    }

    @GetMapping("/get")
    public List<RouteModel> getRoutes() {
        return routeRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public RouteModel getRoute(@PathVariable int id) {
        return routeRepo.findById(id).orElse(null);
    }

    @PostMapping("/post")
    public RouteModel addRoute(@RequestBody RouteModel routeModel) {
        routeModel.setId(null);
        return routeRepo.save(routeModel);
    }

    @PutMapping("/put")
    public RouteModel updateRoute(@RequestBody RouteModel routeModel) {
        // Check if route exists before updating
        if (routeModel.getId() != null && routeRepo.existsById(routeModel.getId())) {
            return routeRepo.save(routeModel);
        } else {
            throw new RuntimeException("Route not found with id: " + routeModel.getId());
        }
    }

    @DeleteMapping("/delete")
    public String deleteRoute(@RequestBody RouteModel routeModel) {
        // Check if route exists before deleting
        if (routeModel.getId() != null && routeRepo.existsById(routeModel.getId())) {
            routeRepo.deleteById(routeModel.getId());
            return "Route deleted successfully";
        } else {
            throw new RuntimeException("Route not found with id: " + routeModel.getId());
        }
    }

    // Alternative: Delete by ID endpoint (recommended)
    @DeleteMapping("/delete/{id}")
    public String deleteRouteById(@PathVariable int id) {
        if (routeRepo.existsById(id)) {
            routeRepo.deleteById(id);
            return "Route deleted successfully";
        } else {
            throw new RuntimeException("Route not found with id: " + id);
        }
    }
}