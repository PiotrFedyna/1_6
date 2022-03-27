package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        double x, y, z, m;
        System.out.println(" podaj x");
        x = p.nextDouble();
        System.out.println(" podaj y");
        y = p.nextDouble();
        System.out.println(" podaj z");
        z = p.nextDouble();
        m =  x;
        if (y>m) m=y;
        if (z>m) m=z;
        System.out.println("Wynik to :" + m);




    }
}