package com.saraya.microservice.passagerservice.bean;

public class PassagerDTO {
    private Long  passager_id;

    private String passport_no;

    private String job;

    private String firstname;

    private String lastname;
    private String psd;

    public PassagerDTO() {
    }

    public PassagerDTO(String passport_no, String job, String firstname, String lastname, String psd) {
        this.passport_no = passport_no;
        this.job = job;
        this.firstname = firstname;
        this.lastname = lastname;
        this.psd = psd;
    }

    public Long getPassager_id() {
        return passager_id;
    }

    public void setPassager_id(Long passager_id) {
        this.passager_id = passager_id;
    }

    public String getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }
}
