package HomeWorks;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Daire'nin yarıçap değerini giriniz :");
        int r = input.nextInt();


        Circle circle = new Circle();
        circle.alanHesapla(r);
        circle.cevreHesapla(r);



    }
}
