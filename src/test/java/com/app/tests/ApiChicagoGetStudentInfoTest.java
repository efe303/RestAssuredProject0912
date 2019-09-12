package com.app.tests;

import com.app.utlities.ApiChicagoStudentsGetUtil;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class ApiChicagoGetStudentInfoTest {
    @Test
    public void studentTest(){
        Response response= RestAssured.get("http://cybertekchicago.com/student/all");
     response.prettyPrint();


    }
    @Test
    public void animalsTest(){
        Response response= RestAssured.get("http://cybertekchicago.com/all");
       // response.prettyPrint();
        response.prettyPrint();

    }




}
