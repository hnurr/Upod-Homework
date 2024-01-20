package HomeWorks;

import java.util.Scanner;

public class GregoryLeibnizPi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number = input.nextInt();

        double sum = 0;

        double start = System.currentTimeMillis();
        for (int k = 0; k <= number; k++) {
            sum += (Math.pow((-1), (k))) / ((2 * k) + 1);
        }
        double finish = System.currentTimeMillis();
        double seconds = (finish - start) / 1000;

        double myPI = sum * 4;

        System.out.println("PI           :" + Math.PI);
        System.out.println("Calculate PI :" + myPI);
        System.out.println("Time to calculate pi is: " + seconds + " .s");


    }
}
