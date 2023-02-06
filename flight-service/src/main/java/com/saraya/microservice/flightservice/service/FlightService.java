package com.saraya.microservice.flightservice.service;


import com.saraya.microservice.flightservice.bean.Flight;
import com.saraya.microservice.flightservice.bean.FlightDto;
import com.saraya.microservice.flightservice.repo.FlightRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class FlightService {
    private  FlightRepo repo;


    public FlightService(FlightRepo repo) {
        this.repo = repo;
    }

    public List<Flight> getAll() {
        return repo.findAll();
    }

    public Flight getById(int id) {
        return repo.findById(id).get();
    }

    public Flight create(FlightDto dto) {

        Flight f = new Flight();
        changeToModel(dto, f);
        return repo.save(f);
    }

    private static void changeToModel(FlightDto dto, Flight f) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("YY/MM/DD");

        f.setNo(dto.getNo());
        f.setDpdate(LocalDate.now());
        f.setArdate(LocalDate.now());
        f.setFrom(dto.getFrom());
        f.setTo(dto.getTo());
    }

    public Flight update(FlightDto dto) {
        Flight f = new Flight();
        f.setFlight_id(dto.getFlight_id());

        changeToModel(dto, f);
        return repo.save(f);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

   

}
