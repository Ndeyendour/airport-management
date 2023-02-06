package com.saraya.microservice.flightservice.bean;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flight_id;
    private String no;
    @Column(columnDefinition = "date")
    private LocalDate dpdate;
    @Column(columnDefinition = "date")
    private LocalDate ardate;
    @Column(name="valueFrom")
    private String from;
    @Column(name="valueTo")
    private String to;

    public Flight() {
    }

    public Flight(int flight_id, String no, LocalDate dpdate, LocalDate ardate, String from, String to) {
        this.flight_id = flight_id;
        this.no = no;
        this.dpdate = dpdate;
        this.ardate = ardate;
        this.from = from;
        this.to = to;
    }



    public String getNo() {
        return no;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public LocalDate getDpdate() {
        return dpdate;
    }

    public void setDpdate(LocalDate dpdate) {
        this.dpdate = dpdate;
    }

    public LocalDate getArdate() {
        return ardate;
    }

    public void setArdate(LocalDate ardate) {
        this.ardate = ardate;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
