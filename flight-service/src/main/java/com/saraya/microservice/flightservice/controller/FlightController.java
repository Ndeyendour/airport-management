package com.saraya.microservice.flightservice.controller;



import com.saraya.microservice.flightservice.bean.Flight;
import com.saraya.microservice.flightservice.bean.FlightDto;
import com.saraya.microservice.flightservice.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flgt")
public class FlightController {
    private  FlightService service ;

    public FlightController(FlightService service) {
        this.service = service;
    }


    @GetMapping
    public List<Flight> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Flight getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public Flight create(@RequestBody FlightDto d) {
        return service.create(d);
    }

    @PutMapping
    public Flight update(@RequestBody FlightDto d) {
        return service.update(d);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    /*@GetMapping("/id/{id}")
    public Passager getIdDept(@PathVariable int passager_id  )
    {
        return service.getIdArp(passager_id);
    }*/

}
