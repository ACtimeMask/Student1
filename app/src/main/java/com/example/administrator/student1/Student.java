package com.example.administrator.student1;

/**
 * Created by Administrator on 2015/12/11.
 */
public class Student {
    private String name;
    private int imageId;
    public Student(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
