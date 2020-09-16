package com.prog_kiev;

import javax.annotation.processing.SupportedSourceVersion;

public class Cat {
    private String name;
    private double weight;
    private String color;

    public Cat(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public void meow(){
        System.out.println(this.name + " " + "meooow!!");
    }
}
