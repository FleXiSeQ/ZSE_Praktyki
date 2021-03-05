package second_week.tabele;

import java.util.Arrays;
import java.util.Collections;

public class zadanie5 {
    public static void main(String[] args) {
        Integer[] tab = {35,26,76,40,666,49,21, 12,344,10001, 5431,442,82,232,7654,2137,6413,15634,43452,5643};

        Arrays.sort(tab,0,9  );

        for(Integer i=0;i<10; i++){
            System.out.print(tab[i]+ " ");

        }
        Arrays.sort(tab, 10,19, Collections.reverseOrder() );
        for(Integer j=10; j<19; j++){
            System.out.print(tab[j] + " ");
        }
    }

}
