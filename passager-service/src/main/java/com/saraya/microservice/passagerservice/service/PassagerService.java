package com.saraya.microservice.passagerservice.service;

;
import com.saraya.microservice.passagerservice.bean.Passager;
import com.saraya.microservice.passagerservice.bean.PassagerDTO;
import com.saraya.microservice.passagerservice.repo.PassagerRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PassagerService {
    private final PassagerRepo repo;



    public PassagerService(PassagerRepo repo) {

        this.repo = repo;
    }

    public List<Passager> getAll(){
        return repo.findAll();
    }

    public Passager getById(int id) {
        return repo.findById(id).get();
    }

    public Passager create(PassagerDTO dto) {

        Passager p = new Passager();
        RestTemplate template = new RestTemplate();
        Map<String, String> urlValues = new HashMap<>();
        urlValues.
                put("name", dto.getPsd());
        String idpsd = template.getForEntity(
                "http://localhost:8700/depts/name/{name}",
                String.class,
                urlValues)
                .getBody();
        changeToModel(dto, p);
        p.setId(idpsd);
        return repo.save(p);



    }

    private static void changeToModel(PassagerDTO dto, Passager p) {

        p.setPassport_no(dto.getPassport_no());
        p.setJob(dto.getJob());
        p.setFirstname(dto.getFirstname());
        p.setLastname(dto.getLastname());

    }

    public Passager update(PassagerDTO pas) {

        Passager p = new Passager();
        p.setPassager_id(pas.getPassager_id());
        changeToModel(pas,p);
        return repo.save(p);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

   /* public Passager getIdArp(int passager_id) {

        return repo.findByPassager_id(passager_id);
    }*/
}
