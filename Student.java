package com.company;

class Student {
    public String name;
    private String id;

    public Student(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name=s;
    }
}