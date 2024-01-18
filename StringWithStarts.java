package HomeWorks;

import java.util.Scanner;

public class StringWithStarts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir kelime girin :");
        String word = input.nextLine();

        for (int i=0 ;i<word.length();i++){

            char ch=word.charAt(i);

             if( (ch == ' ') || (ch == ',') || (ch == '.') ){
                System.out.print(ch);
                continue;
            }
            else if(i<word.length()-1 && word.charAt(i+1) !=' ' && word.charAt(i+1) !=',' && word.charAt(i+1) !='.'){
                System.out.print(ch);
                System.out.print("*");
            }
           else {
                System.out.print(word.charAt(i));
            }
        }
    }
}
