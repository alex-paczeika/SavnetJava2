package DataAccesPackage;

import Model.*;

import java.util.*;

public class FakeDAO {
    static ArrayList<Army> arm1 = new ArrayList<Army>();
    static ArrayList<Army> arm2 = new ArrayList<Army>();

    public static Comparator<Army> StuRollno = new Comparator<Army>() {

        @Override
        public int compare(Army o1, Army o2) {


            int roll = o1.getFirepower();
            int roll2 = o2.getFirepower();
            return roll - roll2;


        }
    };

    public static void main(String[] args) {

//




        arm1.add(new Soldati("Trupa1"));
        arm1.add(new Soldati("Trupa12"));
        arm1.add(new Tancuri("TrupaTancuri1", 3, 5));
        arm1.add(new Tancuri("TrupaTancuri12", 6, 8));
        arm1.add(new NaveDeRazboi("TrupaNave1", 11, 15));
        arm1.add(new NaveDeRazboi("TrupaNave12", 12, 15));
        arm1.add(new Submarine("TrupaSubmarine1", 12));
        arm1.add(new Submarine("TrupaSubmarine12", 14));
        arm1.add(new AvioaneDeLupta("TrupaAvioane1", 16, 10));
        arm1.add(new AvioaneDeLupta("TrupaAvioane12", 19, 10));

        arm2.add(new Soldati("Trupa2"));
        arm2.add(new Soldati("Trupa21"));
        arm2.add(new Tancuri("TrupaTancuri2", 6, 2));
        arm2.add(new Tancuri("TrupaTancuri21", 7, 2));
        arm2.add(new NaveDeRazboi("TrupaNave2", 14, 16));
        arm2.add(new NaveDeRazboi("TrupaNave21", 74, 16));
        arm2.add(new Submarine("TrupaSubmarine2", 9));
        arm2.add(new Submarine("TrupaSubmarine21", 91));
        arm2.add(new AvioaneDeLupta("TrupaAvioane2", 9, 5));
        arm2.add(new AvioaneDeLupta("TrupaAvioane21", 5, 5));



    }


    public  void AfisaresiSortare()
    {

        int sum = 0;

        Collections.sort(arm1, StuRollno);

        for (Army army : arm1) {
            System.out.println(army.toString());
            System.out.println(army.getFirepower());
            sum = army.getFirepower() + sum;


        }


        System.out.println("\nSuma puterii de foc a armatei 1 este " + sum);

    }


    public  void ArmyBattle() {



        int opt = 1;
        while (opt != 0) {


            System.out.println("1.Bataie Soldati");
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();

            switch (opt) {

                case 1:


            }
        }
    }


}
