package HomeWorks;

import java.util.Scanner;

public class Notlandirma {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

        System.out.print("Öğrenci sayısını girin :");
        int number = input.nextInt();

        input.nextLine();

        String student[] = new String[number];

        int midtermnote[]=new int[number];

        int finalnot[]=new int[number];

        int avarage[]=new int[number];


        for (int i=0 ;i<number ;i++) {
            System.out.println("Öğrenci : "+ (i+1));

            System.out.print("Öğrenci adı giriniz: ");
            student[i] = input.nextLine();

            System.out.print("Vize not :");
            midtermnote[i] = input.nextInt();

            System.out.print("Final not :");
            finalnot[i] = input.nextInt();


            input.nextLine();



            avarage[i] = (midtermnote[i] * 4 / 10) + (finalnot[i] * 6 / 10);




            if (avarage[i] >= 90) {
                System.out.println("Genel Not :" + avarage[i] + "- AA");
            } else if (80 <= avarage[i] && avarage[i] <= 89) {
                System.out.println("Genel Not :" + avarage[i] + "- BA");

            } else if (70 <= avarage[i] && avarage[i] <= 79) {
                System.out.println("Genel Not :" + avarage[i] + "- BB");

            } else if (60 <= avarage[i] && avarage[i] <= 69) {
                System.out.println("Genel Not :" + avarage[i] + "- CB");

            } else if (50 <= avarage[i] && avarage[i] <= 59) {
                System.out.println("Genel Not :" + avarage[i] + "- CC");

            } else if (40 <= avarage[i] && avarage[i] <= 49) {
                System.out.println("Genel Not :" + avarage[i] + "- DC");

            } else if (30 <= avarage[i] && avarage[i] <= 39) {
                System.out.println("Genel Not :" + avarage[i] + "- DD");

            } else {
                System.out.println("Genel Not :" + avarage[i] + "- FF");

            }
            System.out.println();
        }


    }
}
