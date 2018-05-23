package com.company;

import java.util.Scanner;

abstract class pet {
    protected float weight;
    protected String name;
    protected String sex;
    public pet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка:\t");
        name=in.nextLine();
        System.out.print("Вес:\t");
        if(in.hasNextFloat()) weight=in.nextFloat();
        else System.out.println("Введены неверные значения");
        System.out.print("Пол:\t");
        in.nextLine();
        sex=in.nextLine();
    }
}

abstract class Pets{
    protected int age;
    protected String name;
    protected boolean hungry;
    public Pets(){
        Scanner in = new Scanner(System.in);
        System.out.print("Age:\t");
        if(in.hasNextInt()) age=in.nextInt();
        else System.out.println("Введены неверные значения");
        in.nextLine();
        System.out.print("Name:\t");
        name=in.nextLine();
        System.out.print("Hungry:\t");
        if(in.hasNextBoolean()) hungry=in.nextBoolean();
        else System.out.println("Введены неверные значения");
    }
    public abstract void voice();
}

class Snake extends Pets{
    public Snake(){
        super();
    }
    public void voice(){
        System.out.println("Шшшшшшшшш");
    }
}

class Dog extends Pets{
    public Dog(){
        super();
    }
    public void voice(){
        System.out.println("Гав");
    }
}

class PatrolDog extends Pets{
    public PatrolDog(){
        super();
    }
    public void voice() {
        System.out.println("Гав!Гав!");
    }
}

class Cat extends Pets{
    public Cat(){
        super();
    }
    public void voice() {
        System.out.println("Мяу");
    }
}

class Fish extends Pets{
    public Fish(){
        super();
    }
    public void voice() {
        System.out.println("???");
    }
}

interface PassangersAuto{
    void passtravel();
}

interface CargoAuto{
    void cargotravel();
}

class Truck implements CargoAuto, PassangersAuto{
    public void passtravel(){
        System.out.println("Берет мало пассажиров");
    }
    public void cargotravel(){
        System.out.println("Берет много груза");
    }
}

class Sedan implements CargoAuto, PassangersAuto{
    public void passtravel(){
        System.out.println("Берет мало пассажиров");
    }
    public void cargotravel(){
        System.out.println("Берет мало груза");
    }
}

class Pickup implements CargoAuto, PassangersAuto{
    public void passtravel(){
        System.out.println("Берет мало пассажиров");
    }
    public void cargotravel(){
        System.out.println("Берет много груза");
    }
}

public class Main {

    public static void main(String[] args) {
	    Snake a = new Snake();
	    Dog b = new Dog();
	    PatrolDog c = new PatrolDog();
	    Cat d = new Cat();
	    Fish e = new Fish();
	    a.voice();
        b.voice();
        c.voice();
        d.voice();
        e.voice();
        Truck tr = new Truck();
        Sedan se = new Sedan();
        Pickup pic = new Pickup();
        tr.cargotravel();
        tr.passtravel();
        se.cargotravel();
        se.passtravel();
        pic.cargotravel();
        pic.passtravel();
    }
}
