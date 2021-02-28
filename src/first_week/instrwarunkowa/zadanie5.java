package first_week.instrwarunkowa;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe: ");
        double liczba1 = skaner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double liczba2 = skaner.nextDouble();
        System.out.println("Którą operację chcesz wykonać? (+=1 -=2 *=3 /=4");
        int operacja = skaner.nextInt();
        if(operacja==1){
            double wynik = liczba1 + liczba2;
            System.out.println("Wynik to: " +wynik);
        }
        if(operacja==2) {
            double wynik2 = liczba1 - liczba2;
            System.out.println("Wynik to: " +wynik2);
        }
        if(operacja==3) {
            double wynik3 = liczba1 * liczba2;
            System.out.println("Wynik to: " +wynik3);
        }
        if(operacja==4) {
            double wynik4 = liczba1 / liczba2;
            System.out.println("Wynik to: "+wynik4);
        }
        else {
            System.out.println("No chyba cie kukle swędzą");
        }


    }
}
