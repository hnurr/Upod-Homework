package HomeWorks;

import java.util.Scanner;

public class Circle {

    final double pi = 3.14;

    double alanHesapla(int r){

        double alan = pi * r * r;

        System.out.println("Daire'nin Alanı :"+alan);

        return alan;
    }

    double cevreHesapla(int r){

        double cevre = 2 * pi * r;

        System.out.println("Daire'nin Çevresi :"+cevre);

        return cevre;


    }


}
