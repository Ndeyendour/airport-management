package com.saraya.microservice.flightservice.bean;

import java.time.LocalDate;

public class FlightDto {
    private int flight_id;
    private String no;
    private String dpdate;
    private String ardate;
    private String from;
    private String to;

    public FlightDto() {
    }

    public FlightDto(int flight_id, String no, String dpdate, String ardate, String from, String to) {
        this.flight_id = flight_id;
        this.no = no;
        this.dpdate = dpdate;
        this.ardate = ardate;
        this.from = from;
        this.to = to;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDpdate() {
        return dpdate;
    }

    public void setDpdate(String dpdate) {
        this.dpdate = dpdate;
    }

    public String getArdate() {
        return ardate;
    }

    public void setArdate(String ardate) {
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
