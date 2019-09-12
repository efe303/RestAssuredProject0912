package com.app.pojos;

import java.util.List;

public class AnimalsOuterArray {

    MyAnimalObject myAnimalObject=new MyAnimalObject();


    public MyAnimalObject getMyAnimalObject() {
        return myAnimalObject;
    }

    public void setMyAnimalObject(MyAnimalObject myAnimalObject) {
        this.myAnimalObject = myAnimalObject;
    }

    public List<MyAnimalObject> getMyAnimalObjects() {
        return myAnimalObjects;
    }

    public void setMyAnimalObjects(List<MyAnimalObject> myAnimalObjects) {
        this.myAnimalObjects = myAnimalObjects;
    }

    List <MyAnimalObject> myAnimalObjects;


}
