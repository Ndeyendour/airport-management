package com.saraya.microservice.flightservice.repo;



import com.saraya.microservice.flightservice.bean.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer> {

        // @Query(value = "select dept_id from departments where name=?1", nativeQuery = true)
       /* @Query("select d from airport_geo d where d.country=:country")
        AirportGeo getIdarp(String country);*/

      // AirportGeo  findByCountry(String country);


}
