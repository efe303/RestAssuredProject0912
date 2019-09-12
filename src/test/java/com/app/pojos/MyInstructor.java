package com.app.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MyInstructor {
   private String firstName;
   private String lastName;
   private String subject;
  // private int id;
   private int batch;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

//    public int getId() {
//        return id;
//    }

    public int getBatch() {
        return batch;
    }
}
