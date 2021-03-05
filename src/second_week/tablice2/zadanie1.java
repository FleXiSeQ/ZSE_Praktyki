package second_week.tablice2;

public class zadanie1 {
    public static void main(String[] args) {
        Integer[][] tabdwu = new Integer[5][5];
        Integer value = 5;
        for (Integer i = 0; i < 5; i++) {
            for (Integer j = 0; j < 5; j++) {
                tabdwu[i][j] = value;
                value = value+5;
                System.out.print(tabdwu[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
