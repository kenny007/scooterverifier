package com.webstore.products.controllers;

import com.webstore.products.models.Scooter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/scooters")
public class ScootersController {
    @GetMapping
    public List<Scooter> list(){
        List<Scooter> scooters = new ArrayList<>();

        return  scooters;
    }

    //This method processes registration
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Scooter scooter){

    }

    @GetMapping("/{id}")
    public Scooter get(@PathVariable("id") long id){
        return new Scooter();
    }
}
