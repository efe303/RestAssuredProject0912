package com.app.tests;

import com.app.pojos.MyPerson;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static io.restassured.path.json.JsonPath.given;

public class MyExample {

    @BeforeClass
    public static void setUp()
    {
//        RestAssured.baseURI = "https://uinames.com/api";
    }

    @Test
    public void test() {
        Response response = RestAssured.get("https://uinames.com/api");
        System.out.println(response.statusCode());
        String str = response.prettyPrint();
        System.out.println(str);

    }

    @Test
    public void test2(){
        Response response=RestAssured.get("http://cybertekchicago.com/instructor/all");
        String json=response.asString();
        System.out.println(json);
//        Map<String,String> maps=response.as(HashMap.class);
//        String map=response.prettyPrint();

//        System.out.println(maps);

    }

    @Test
    public void JsonPath(){
        Response response=RestAssured.get("http://cybertekchicago.com/instructor/all");
        JsonPath path=response.jsonPath();
//        String str=response.prettyPrint();
        int rowNum=path.get("instructors.size()");
        String name=path.get("firstName");

        Set <String> names=new HashSet<>();
        Set <String> lastNames=new HashSet<>();
        Set <String> ids=new HashSet<>();
        Set <String> batches=new HashSet<>();
        Set <String> subjects=new HashSet<>();


        for (int i=0;i<rowNum;i++){
            names.add(path.get("instructors["+i+"].firstName"));
            lastNames.add(path.get("instructors["+i+"].lastName"));
            ids.add(path.get("instructors["+i+"].id"));
            batches.add(path.get("instructors["+i+"].batch"));
            subjects.add(path.get("instructors["+i+"].subject"));

        }
        System.out.println(names.size());
        System.out.println(lastNames.size());

    }


    @Test
    public void MyPersonSetUp(){
        MyPerson person1=new MyPerson();
        MyPerson person2=new MyPerson();
        MyPerson person3=new MyPerson();
        MyPerson person4=new MyPerson();

        Response r=RestAssured.get("http://cybertekchicago.com/instructor/all");
        JsonPath path = r.jsonPath();


        List <String> names=new ArrayList<>();
        List <String> lastNames=new ArrayList<>();
        List <Integer> ids=new ArrayList<>();
        List <Integer> batches=new ArrayList<>();
        List <String> subjects=new ArrayList<>();


        for (int i=0;i<4;i++) {
            names.add(path.get("instructors[" + i + "].firstName"));
            lastNames.add(path.get("instructors[" + i + "].lastName"));
            ids.add(path.get("instructors[" + i + "].id"));
            batches.add(path.get("instructors[" + i + "].batch"));
            subjects.add(path.get("instructors[" + i + "].subject"));
        }  for (int i=0;i<4;i++){
            if(i==0) {
                person1.setFirstName(names.get(i));
                person1.setLastName(lastNames.get(i));
                person1.setId(ids.get(i));
                person1.setBatch(batches.get(i));
                person1.setSubject(subjects.get(i));
            }else if(i==1){
                person2.setFirstName(names.get(i));
                person2.setLastName(lastNames.get(i));
                person2.setId(ids.get(i));
                person2.setBatch(batches.get(i));
                person2.setSubject(subjects.get(i));
            }else if(i==2){
                person3.setFirstName(names.get(i));
                person3.setLastName(lastNames.get(i));
                person3.setId(ids.get(i));
                person3.setBatch(batches.get(i));
                person3.setSubject(subjects.get(i));
            }else if (i==3){
                person4.setFirstName(names.get(i));
                person4.setLastName(lastNames.get(i));
                person4.setId(ids.get(i));
                person4.setBatch(batches.get(i));
                person4.setSubject(subjects.get(i));
            }



        }


        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());



    }

    @Test
    public void uiNames(){

    }

}
