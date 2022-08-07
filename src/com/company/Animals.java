package com.company;

public class Animals {
    private String name;
    private String type;
    private age age;
    private Ocean ocean;

    public Animals(String name, String type, com.company.age age, Ocean ocean) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.ocean = ocean;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public com.company.age getAge() {
        return age;
    }

    public Ocean getOcean() {
        return ocean;
    }

    public String getInfo(){
        return "name " + name +
                "\ntype " + type +
                "\nage " +age +
                "\nocean " + ocean.getDepth();
    }
}
