package com.company;

public class Kit extends Animals{
    public Kit(String name, String type, com.company.age age, Ocean ocean) {
        super(name, type, age, ocean);
    }
    void swim(){
        System.out.println("Я плаваю");
    }
    void  swim(String swim){
        System.out.println("Я ныряю");
    }
    final void swim(int age){
        System.out.println("Я утонул");
    }
}
