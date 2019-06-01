package DataAccesPackage;

import Model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FakeDAO {


    public static Comparator<Army> StuRollno = new Comparator<Army>() {

        @Override
        public int compare(Army o1, Army o2) {


            int roll = o1.getFirepower();
            int roll2 = o2.getFirepower();
            return roll - roll2;


        }
    };

    public static void main(String[] args) {

                Army[] army1 = {new Soldati(10, "Trupa1"),
                new Tancuri(20, "TrupaTancuri1", 3, 5),
                new NaveDeRazboi(30, "TrupaNave1", 12, 15),
                new Submarine(25, "TrupaSubmarine1", 14),
                new AvioaneDeLupta(50, "TrupaAvioane1", 19, 10)};


        int sum=0;

        ArrayList<Army> arm1 = new ArrayList<Army>();
        ArrayList<Army> arm2 = new ArrayList<Army>();


        arm1.add(new Soldati(10, "Trupa1"));
        arm1.add(new Tancuri(20, "TrupaTancuri1", 3, 5));
        arm1.add(new NaveDeRazboi(30, "TrupaNave1", 12, 15));
        arm1.add(new Submarine(25, "TrupaSubmarine1", 14));
        arm1.add(new AvioaneDeLupta(50, "TrupaAvioane1", 19, 10));

        arm2.add(new Soldati(10, "Trupa2"));
        arm2.add(new Tancuri(20, "TrupaTancuri2", 6, 2));
        arm2.add(new NaveDeRazboi(30, "TrupaNave2", 14, 16));
        arm2.add(new Submarine(25, "TrupaSubmarine2", 9));
        arm2.add(new AvioaneDeLupta(50, "TrupaAvioane2", 9, 5));



        Collections.sort(arm1, StuRollno);

        for (Army army : arm1) {
            System.out.println(army.toString());
           sum= army.getFirepower() + sum;



        }





        System.out.println("\nSuma puterii de foc a armatei 1 este " + sum);


    }


}
