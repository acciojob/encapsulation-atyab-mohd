package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();
        //obj.name = "This will show error";
        obj.setName("Using getter and setter");
        obj.getName();
    }
}