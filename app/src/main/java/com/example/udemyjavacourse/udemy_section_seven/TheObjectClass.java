package com.example.udemyjavacourse.udemy_section_seven;

public class TheObjectClass extends Object{

    public static String theObjectClass() {
        StudentTwo max = new StudentTwo("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);

        return "";
    }


}

class StudentTwo {
    private String name;
    private int age;

    StudentTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "StudentTwo{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends StudentTwo {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " +  super.toString();
    }
}
