package second_week.tabele;

import java.util.Random;


public class zadanie3 {
    public static void main(String[] args) {
        Random rand = new Random();

        String [] Pjes = {"Doggedo" , "Piesu" , "karolwojtyka"};

        int rand1 = rand.nextInt(3);



        if(rand1 == 0){
            System.out.println("Imie psa to: " + Pjes[0]);
        }
        if(rand1 == 1){
            System.out.println("Imie psa to: " + Pjes[1]);
        }
        if(rand1 == 2){
            System.out.println("Imie psa to: " +  Pjes[2]);
        }
    }
}
