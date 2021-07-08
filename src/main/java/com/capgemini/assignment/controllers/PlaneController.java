package com.capgemini.assignment.controllers;

import com.capgemini.assignment.models.Plane;
import com.capgemini.assignment.repositories.IPlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/planes")
public class PlaneController {

    @Autowired
    private IPlaneRepository planeRepository;

    @GetMapping("/single")
    public Plane getSinglePlane(){
        Plane plane = new Plane("Airbus A300 AA1",200,"Captain Jan de Vries");
        return  plane;
    }

    @GetMapping("/all")
    public List<Plane> getAllPlanes(){
        return planeRepository.getPlanes();
    }

    @PostMapping("/new")
    public void createPlane(@RequestBody Plane newPlane){
        this.planeRepository.savePlane(newPlane);
    }
    @PutMapping("/update")
    public Plane updatePlane(@RequestBody Plane changePlane){
        return this.planeRepository.updatePlane(changePlane);
    }

    @PostMapping("/delete")
    public void deletePlane(@RequestBody Plane deletePlane){
        this.planeRepository.deletePlane(deletePlane);
    }
}
