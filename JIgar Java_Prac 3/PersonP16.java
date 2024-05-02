package com.example;

// PersonP16 class
public class PersonP16 {
    private String name;
    private int age;

    // Constructor
    public PersonP16(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "PersonP16{name='" + name + "', age=" + age + "}";
    }

    // Main class
    public static void main(String[] args) {
        PersonP16 person = new PersonP16("Alice", 30);

        System.out.println(person.toString());
    }
}