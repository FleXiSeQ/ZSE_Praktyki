package second_week.tabele;

import java.util.Arrays;
import java.util.Collections;

public class zadanie2 {
    public static void main(String[] args) {
        String[] tab = {"jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć", "dziesięć"};
        Arrays.sort(tab, Collections.reverseOrder());
        System.out.println("Malejonco: " + Arrays.toString(tab));

    }
}
