package com.app.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {


    private int id;
    private String firstName;
    private String lastName;
    private int batch;
    private String subject;





//    private List<Contact> contact;
//    private Company [] company;

//    public Contact[] getContact() {
//        return contact;
//    }
//
//    public void setContact(Contact[] contact) {
//        this.contact = contact;
//    }
//
//    public Company[] getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company[] company) {
//        this.company = company;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
