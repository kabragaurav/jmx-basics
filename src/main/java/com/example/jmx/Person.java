package com.example.jmx;

public class Person implements PersonMBean {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void celebrateBirthday() {
        this.age++;
        System.out.println("Happy Birthday! You are now " + age + " years old.");
    }
}
