package first_week.instrwarunkowa;
import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbe ziomeq: " + "\n");
        int liczba = skaner.nextInt();
        if(liczba>0){
            System.out.println("liczba większa od 0");
        }
        else {
            if(liczba<0) {
                System.out.println("liczba mniejsza od 0");
            }
            else {
                System.out.println("Liczba jest równa 0");
            }
        }
    }
}
