package second_week.piec;
interface Grill{
    void grill();
}
interface Opiekacz{
    void ciastka();
    void chlep();
}

public class piec implements Grill, Opiekacz {

    int czas;
    int temp;

    public void wlacz(){
        System.out.println("Dajemy i odpalamy piec, temperatura to: " + temp + "na: " + czas + "minut");
    }

    @Override
    public void grill(){
        czas = 420;
        temp= 2137;
        wlacz();
    }

    @Override
    public void ciastka(){
        czas = 666;
        temp = 2137;
        wlacz();
    }

    @Override
    public void chlep(){
        czas = 656;
        temp = 1410;
        wlacz();
    }
    public static void main(String[] args) {

        piec piec = new piec();

        Grill grill = piec;
        Opiekacz opiekacz = piec;

        grill.grill();
        opiekacz.ciastka();
        opiekacz.chlep();



    }
}
