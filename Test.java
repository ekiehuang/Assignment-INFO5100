package com.company;

class Test{
    public static void main(String[] args){
        Courses course=new Courses("math");
        Student stu1=new Student("a");
        Student stu2=new Student("b");
        Student stu3=new Student("c");

        course.registerStudent("math", stu1 );
        course.registerStudent("math", stu2 );
        course.registerStudent("math", stu3);
        System.out.println(course.title+" is full? "+ course.isFull("math"));
        System.out.println(course.title+" has the following students "+course.getStudent("math"));
    }
}
