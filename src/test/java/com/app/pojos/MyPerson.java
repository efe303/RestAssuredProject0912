package com.app.pojos;

public class MyPerson {
    private String firstName;
    private String lastName;
    private int id;
    private int batch;
    private String subject;

    public MyPerson (){

    }
    public MyPerson(String firstName, String lastName, int id, int batch, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.batch = batch;
        this.subject = subject;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "MyPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", batch=" + batch +
                ", subject='" + subject + '\'' +
                '}';
    }
}
