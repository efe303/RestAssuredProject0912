package com.app.utlities;

import com.app.pojos.Address;
import com.app.pojos.Company;
import com.app.pojos.Contact;
import com.app.pojos.Student;

import java.util.List;

public class ApiChicagoStudentsGetUtil {

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    private List<Address> addressList;

    public String getWholeStudentInfo() {
        return wholeStudentInfo;
    }

    public void setWholeStudentInfo(String wholeStudentInfo) {
        this.wholeStudentInfo = wholeStudentInfo;
    }

    private String wholeStudentInfo;
    private String [] allStudent=wholeStudentInfo.split(":");

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    private List <Company> companyList;
    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    private List <Contact> contactList;
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    private List <Student> studentList;

    public ApiChicagoStudentsGetUtil(String studentInfo){
      this.wholeStudentInfo=studentInfo;
      this.wholeStudentInfo=wholeStudentInfo.replace("{","").replace("[","").replace("]","")
              .replace("}","").replace("\"students\":","").replace("\"","").replace(",","");
    }
    public ApiChicagoStudentsGetUtil(){

    }

    public List<Student> getAllStedentInfo(){
        int arrayCount=0;
        int contactCount=0;
        int companyCount=0;
        int adrressCount=0;
        for (int i=0;i<allStudent.length;i++){
            if(allStudent[i].equalsIgnoreCase("id")){
                studentList.get(arrayCount).setId(Integer.parseInt(allStudent[i+1]));
            }else if(allStudent[i].equalsIgnoreCase("firstName")){
                studentList.get(arrayCount).setFirstName(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("lastName")){
                studentList.get(arrayCount).setLastName(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("batch")){
                studentList.get(arrayCount).setBatch(Integer.parseInt(allStudent[i+1]));
                arrayCount++;

            }else if(allStudent[i].equalsIgnoreCase("contactId")){
                contactList.get(contactCount).setContactId(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("phone")){
                contactList.get(contactCount).setPhone(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("emailAddress")){
                contactList.get(contactCount).setEmailAddress(allStudent[i+1]);
                contactCount++;
            }else if(allStudent[i].equalsIgnoreCase("companyId")){
                companyList.get(companyCount).setCompanyId(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("companyName")){
                companyList.get(companyCount).setCompanyName(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("title")){
                companyList.get(companyCount).setTitle(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("startDate")){
                companyList.get(companyCount).setStartDate(allStudent[i+1]);
                companyCount++;
            }else if(allStudent[i].equalsIgnoreCase("addressId")){
                addressList.get(adrressCount).setAddressId(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("street")){
                addressList.get(adrressCount).setStreet(allStudent[i+1]);
            }else if (allStudent[i].equalsIgnoreCase("city")){
                addressList.get(adrressCount).setCity(allStudent[i+1]);
            }else if (allStudent[i].equalsIgnoreCase("state")){
                addressList.get(adrressCount).setState(allStudent[i+1]);
            }else if(allStudent[i].equalsIgnoreCase("zipCode")){
                addressList.get(adrressCount).setZipCode(allStudent[i+1]);
               adrressCount++;
            }
        }

        return studentList;
    }





}
