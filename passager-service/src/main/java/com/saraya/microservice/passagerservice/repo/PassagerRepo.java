package com.saraya.microservice.passagerservice.repo;


import com.saraya.microservice.passagerservice.bean.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepo extends JpaRepository<Passager, Integer> {

        // @Query(value = "select dept_id from departments where name=?1", nativeQuery = true)
       /* @Query("select d from airport_geo d where d.country=:country")
        AirportGeo getIdarp(String country);*/

        //Passager  findByPassager_id(int passager_id);


}
