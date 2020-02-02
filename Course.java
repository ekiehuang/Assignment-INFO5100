package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Courses {
    String title;
    public Courses(String title) {
        this.title = title;
    }
    HashMap<String, List<String>> registerStudent = new HashMap<String, List<String>>();
    public List<String> registerStudent(String title, Student student) {
        List<String> students = registerStudent.get(title);
        if (students == null) {
            students = new ArrayList<String>();
            registerStudent.put(title, students);
        }

        if (students.size() < 10) {
            students.add(student.getName());
        }
        return students;
    }


    public List<String> getStudent(String title){
        return registerStudent.get(title);
    }
    public boolean isFull(String title){
        return registerStudent.get(title) != null && registerStudent.get(title).size() >= 10;
    }

}

