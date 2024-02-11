package HomeWorks;

public class SayiOkunusu {
        public static void sayiOkunusu ( int number){

            if (0 < number && number <= 999) {

                int yuzler = number / 100;
                int onlar = (number / 10) % 10;
                int birler = number % 10;

                switch (yuzler) {
                    case 1:
                        System.out.print("Yüz");
                        break;
                    case 2:
                        System.out.print("İkiyüz");
                        break;
                    case 3:
                        System.out.print("Üçyüz");
                        break;
                    case 4:
                        System.out.print("Dörtyüz");
                        break;
                    case 5:
                        System.out.print("Beşyüz");
                        break;
                    case 6:
                        System.out.print("Altıyüz");
                        break;
                    case 7:
                        System.out.print("Yediyüz");
                        break;
                    case 8:
                        System.out.print("Sekizyüz");
                        break;
                    case 9:
                        System.out.print("Dokuzyüz");
                        break;
                }
                switch (onlar) {
                    case 1:
                        System.out.print("On");
                        break;
                    case 2:
                        System.out.print("Yirmi");
                        break;
                    case 3:
                        System.out.print("Otuz");
                        break;
                    case 4:
                        System.out.print("Kırk");
                        break;
                    case 5:
                        System.out.print("Elli");
                        break;
                    case 6:
                        System.out.print("Altmıs");
                        break;
                    case 7:
                        System.out.print("Yetmis");
                        break;
                    case 8:
                        System.out.print("Seksen");
                        break;
                    case 9:
                        System.out.print("Doksan");
                        break;
                }
                switch (birler) {
                    case 1:
                        System.out.print("Bir");
                        break;
                    case 2:
                        System.out.print("iki");
                        break;
                    case 3:
                        System.out.print("Üç");
                        break;
                    case 4:
                        System.out.print("Dört");
                        break;
                    case 5:
                        System.out.print("Beş");
                        break;
                    case 6:
                        System.out.print("Altı");
                        break;
                    case 7:
                        System.out.print("Yedi");
                        break;
                    case 8:
                        System.out.print("Sekiz");
                        break;
                    case 9:
                        System.out.print("Dokuz");
                        break;
                }
                System.out.println();

            }
            else {
                System.out.println("Girilen sayı 3 basamaktan fazla olduğu için okuma gerçekleştirilemiyor!!!");
            }
        }

    public static void main(String[] args) {
        sayiOkunusu(123);
        sayiOkunusu(500);
        sayiOkunusu(249);
        sayiOkunusu(1);
        sayiOkunusu(73);
        sayiOkunusu(3333333);
    }


    }


