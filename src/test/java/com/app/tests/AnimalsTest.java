package com.app.tests;


import com.app.pojos.AnimalsOuterArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;

public class AnimalsTest {
    @Test
    public void animalTest()throws IOException {
        Response response = RestAssured.get("https://api.got.show/api/show/animals/");
        ObjectMapper obj = new ObjectMapper();
        AnimalsOuterArray animalsOuterArray;

        response.prettyPrint();
        animalsOuterArray=obj.readValue(response.asString(),AnimalsOuterArray.class);


    }
}
