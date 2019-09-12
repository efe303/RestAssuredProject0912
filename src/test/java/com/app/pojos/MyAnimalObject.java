package com.app.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MyAnimalObject {
    private String name;
    private String _id;
    private String diet;
    private String status;
    private int __v;

    String [] habitat;
    String [] range;
    public String[] getHabitat() {
        return habitat;
    }

    public void setHabitat(String[] habitat) {
        this.habitat = habitat;
    }

    public String[] getRange() {
        return range;
    }

    public void setRange(String[] range) {
        this.range = range;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
