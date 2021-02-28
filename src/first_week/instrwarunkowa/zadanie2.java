package first_week.instrwarunkowa;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbe1 ziomeq: " + "\n");
        int liczba1 = skaner.nextInt();
        System.out.println("Podaj liczbe2 ziomeq: " + "\n");
        int liczba2 = skaner.nextInt();
        System.out.println("Podaj liczbe3 ziomeq: " + "\n");
        int liczba3 = skaner.nextInt();

        if(liczba1>liczba2) {

            if(liczba1>liczba3) {
                System.out.println("Największa liczba to: " + liczba1);
            }
            else {
                System.out.println("Największa liczba to: " +liczba3);
            }
        }
       if(liczba1<liczba2) {
           if(liczba2>liczba3) {
               System.out.println("Największa liczba to: " +liczba2);
           }
           else{
               System.out.println("Największa liczba to: " +liczba3);
           }
       }
       if(liczba1==liczba2) {
           if(liczba1<liczba3) {
               System.out.println("Największa jest liczba: " +liczba3);
           }
           else {
               System.out.println("wszystkie są równe");
           }
       }



    }
}
