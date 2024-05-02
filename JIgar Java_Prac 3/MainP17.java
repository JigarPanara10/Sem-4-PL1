package com.example;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
}

    public String getName() {
        return name;
}

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
}

    public void setAge(int age) {
        this.age = age;
}

    //Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Student class extending Person
class Student extends Person {
    private int id;
    private String major;

    public Student(String name, int age, int id, String major) {
        super(name, age);
        this.id = id;
        this.major = major;
}

    public int getId() {
        return id;
}

    public void setId(int id) {
        this.id = id;
}

    public String getMajor() {
        return major;
}

    public void setMajor(String major) {
        this.major = major;
}
    //Override
    public String toString() {
        return super.toString() + ", Student{id=" + id + ", major='" + major + "'}";
    }
}
package com.test;

import com.example.Person;
import com.example.Student;


public class MainP17 {
    public static void main(String[] args) {
        Student student = new Student("Prem", 17, 12345, "Computer Science");
        student.setId(54321);
        student.setMajor("Java");

        System.out.println(student.toString()); // OUTPUT => Person{name='Prem', age=17}, Student{id=54321, major='Java'}

    }
}
