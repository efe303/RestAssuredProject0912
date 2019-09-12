package com.app.tests;

import com.app.pojos.UiNames;
import com.app.pojos.UinameOuter;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class UinamesTest {
    @Test
    public void uinamesTest()throws Exception{
       Response response= RestAssured.get("https://uinames.com/api/?amount=500");
//       response.prettyPrint();
        UinameOuter uiNames;
        ObjectMapper obj=new ObjectMapper();
        uiNames=obj.readValue(response.asString(),UinameOuter.class);

    }
}
