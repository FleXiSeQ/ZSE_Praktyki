package first_week.instrwarunkowa;

import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        int poprawnosc = 0;
        Scanner skaner = new Scanner(System.in);
        String plogin = "tajnepomidorki";
        String phaslo = "zieloneogorki";
        System.out.println("Podaj login: ");
        String login = skaner.next();
        System.out.println("podaj haslo: ");
        String haslo = skaner.next();
        if(login.equals(plogin)) {
            poprawnosc = poprawnosc+1;
        }
        if(haslo.equals(phaslo)) {
            poprawnosc = poprawnosc+1;
        }
        if(poprawnosc==2) {
            System.out.println("pomyslnie zalogowano");
        }
        else {
            System.out.println("brak autoryzacji");
        }

    }
}
