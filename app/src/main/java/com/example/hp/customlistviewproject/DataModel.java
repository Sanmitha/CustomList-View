package com.example.hp.customlistviewproject;

/**
 * Created by Vasuki on 12/9/2017.
 */

public class DataModel {
    String name;
    String dob;
    String gender;
    String web;
    String content;

    public DataModel(String name, String dob, String gender, String web, String content) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.web = web;
        this.content = content;

    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
    public String getGender()
    {
        return gender;
    }
    public String getWeb()
    {
        return web;
    }
    public String getContent()
    {
        return content;
    }
}
