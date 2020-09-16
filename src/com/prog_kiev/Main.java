package com.prog_kiev;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 3, "white");
        System.out.println(cat1);
        cat1.meow();
        System.out.println();

        Triangle trian = new Triangle(3,4,5);
        System.out.println(trian.calculateSquare());
        System.out.println();

        Vector3d vec1 = new Vector3d(1,2,3);
        Vector3d vec2 = new Vector3d(4,5,6);
        Vector3d vec3 = vec1.vectProduct(vec2);
        Vector3d vec4 = vec1.addVector(vec2);
        double vec5 = vec1.scalarProduct(vec2);

        System.out.println(vec3);
        System.out.println(vec4);
        System.out.println(vec5);
    }
}
