package second_week.tablice2;

import java.util.ArrayList;
import java.util.Collections;

public class zadanie3 {
    public static void main(String[] args) {
        ArrayList<String> gry = new ArrayList<>();
        gry.add("Wiedźmin 3");
        gry.add("Minecraft");
        gry.add("Fnaf");
        gry.add("Devil may cry");
        System.out.println(gry);

        gry.add("Borderlands");
        System.out.println(gry);
        gry.add(1, "Mario Bros");
        System.out.println(gry);
        gry.remove("Wiedźmin 3");
        System.out.println(gry);
        gry.remove(2);
        System.out.println(gry);
        gry.set(3, "Bleach Brave Souls");
        System.out.println(gry);
        Collections.sort(gry);
        System.out.println(gry);
        gry.clear();
        System.out.println(gry);


    }
}
