package com.in28minutes.oop.level2.inheritance;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person(String name){
        System.out.println("Person Constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return name + "#" + email + "#" + phoneNumber;
    }
}
