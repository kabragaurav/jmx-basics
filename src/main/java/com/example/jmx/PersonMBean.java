package com.example.jmx;

public interface PersonMBean {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
    void celebrateBirthday();
}
