package com.saraya.microservice.passagerservice.controller;



import com.saraya.microservice.passagerservice.bean.PassagerDTO;
import com.saraya.microservice.passagerservice.service.PassagerService;
import com.saraya.microservice.passagerservice.bean.Passager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pass")
public class PassagerController {
    private final PassagerService service ;

    public PassagerController(PassagerService service) {
        this.service = service;
    }


    @GetMapping
    public List<Passager> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Passager getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public Passager create(@RequestBody PassagerDTO d) {
        return service.create(d);
    }

    @PutMapping
    public Passager update(@RequestBody PassagerDTO d) {
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
