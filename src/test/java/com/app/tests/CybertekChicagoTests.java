package com.app.tests;

import com.app.pojos.ChicagoOuterArr;
import com.app.pojos.Student;
import com.app.pojos.Students;
import com.app.pojos.TemporaryOuter;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class CybertekChicagoTests {
    @Test
    public void InstructorTest()throws IOException {
        Response response= RestAssured.get("http://cybertekchicago.com/instructor/all");

        ChicagoOuterArr chicagoOuterArr;
        JsonPath path=response.jsonPath();
        ObjectMapper obj=new ObjectMapper();

             chicagoOuterArr=obj.readValue(response.asString(), ChicagoOuterArr.class);

             int size = chicagoOuterArr.getInstructors().size();
             System.out.println(size);

             response.prettyPrint();
             for (int i=0;i<size;i++){
                 System.out.println(chicagoOuterArr.getInstructors().get(i).getFirstName());
                 System.out.println(chicagoOuterArr.getInstructors().get(i).getLastName());
                 System.out.println(chicagoOuterArr.getInstructors().get(i).getBatch());
//                 System.out.println(chicagoOuterArr.getInstructors().get(i).getId());
                 System.out.println(chicagoOuterArr.getInstructors().get(i).getSubject());
             }


    }

    @Test
    public void StrudentsTest()throws IOException {
        Response response= RestAssured.get("http://cybertekchicago.com/student/all");

        response.prettyPrint();



//        String print=response.prettyPrint();
        Students students;
//        JsonPath path=response.jsonPath();
        ObjectMapper obj=new ObjectMapper();
//
        students=obj.readValue(response.asString(), Students.class);
//        int size = students.getStudents().size();
//        System.out.println(size);
//
//       for (int i=0;i<size;i++){
//           System.out.println(students.getStudents().get(i).getFirstName());
//           System.out.println(students.getStudents().get(i).getLastName());
//           System.out.println(students.getStudents().get(i).getSubject());
//           System.out.println(students.getStudents().get(i).getId());
//           System.out.println(students.getStudents().get(i).getBatch());
//
//       }



    }
     @Test
     public void testDemo(){
        Response response=RestAssured.get("www.uinames/api/");
        response.prettyPrint();
     }



    @Test
    public void UinamesTests(){
        Response response=RestAssured.get("https://api.got.show/api/show/animals/");

        ObjectMapper obj=new ObjectMapper();
        response.prettyPrint();

    }

    @Test
    public void AdemApi()throws IOException{
        Response response=RestAssured.get("http://cybertekchicago.com/instructor/all");
        ObjectMapper objectMapper=new ObjectMapper();
        TemporaryOuter instructors;

        instructors=objectMapper.readValue(response.asString(),TemporaryOuter.class);

        int size=instructors.getInstructors().size();
        System.out.println(size);
        for (int i=0;i<size;i++){
            System.out.println(instructors.getInstructors().get(i).getFirstName());
            System.out.println(instructors.getInstructors().get(i).getLastName());
            System.out.println(instructors.getInstructors().get(i).getId());
            System.out.println(instructors.getInstructors().get(i).getBatch());
            System.out.println(instructors.getInstructors().get(i).getSubject());




        }


    }

}

