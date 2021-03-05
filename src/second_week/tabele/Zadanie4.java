package second_week.tabele;

import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        Random rand = new Random();

        String [] Jedzonko = {"Kremówki", "zupka chińska", "nic", "parówka", "Hambagar", "ciastko"};
        int rand1 = rand.nextInt(6);
        int rand2 = rand.nextInt(6);
        int rand3 = rand.nextInt(6);

        System.out.println("Na śniadanie: " + Jedzonko[rand1] +"\n Na obiad: " +Jedzonko[rand2] + "\n Na kolacje: " +Jedzonko[rand3]);
    }
}
