package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Warm_Up {
    @BeforeClass
    public static void SetUp(){
        RestAssured.baseURI="https://api.got.show/api";
    }

    @Test
    public void continentsTest(){
        Response response=RestAssured.get("/continents");
        Assert.assertEquals(200,response.statusCode());
        response.prettyPrint();
    }

    @Test
    public void episodeTest(){
        Response response=RestAssured.get("episodes");
        Assert.assertEquals(200,response.statusCode());
        JsonPath path =response.jsonPath();
        System.out.println((Integer) path.get(""));
    }
}
