package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] commands = {"Сидеть", "Лежать"};
        Shelter romashka = new Shelter("Ромашка",
                "Чуй 1");
        Dog dog = new Dog("Чарли", "Алабай", commands,
                ColorEnum.WHITE, romashka);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув гув");

        Dog dog1 = new Dog("Патрик", "Сибаину", ColorEnum.BROWN,romashka );
        System.out.println(dog1.getInfo());
        Ocean ocean = new Ocean(55);
        Kit kit = new Kit("Megaladon", "Kit", age.THIRTEEN,ocean);
        System.out.println(kit.getInfo());
        Fish fish1 = new Fish("Nemo", "kloun", age.SIX, ocean);
        Fish fish2 = new Fish("Spanch Bob", "Gupka", age.TEN, ocean);
        System.out.println(fish1.getInfo());
        System.out.println(fish2.getInfo());
    }
}
