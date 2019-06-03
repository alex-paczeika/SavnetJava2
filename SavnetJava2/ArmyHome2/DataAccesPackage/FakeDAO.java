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

    public void BazadeDate() {


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


    public void AfisaresiSortare() {

        int sum = 0;

        Collections.sort(arm1, StuRollno);

        for (Army army : arm1) {
            System.out.println(army.toString());
            System.out.println(army.getFirepower());
            sum = army.getFirepower() + sum;


        }


        System.out.println("\nSuma puterii de foc a armatei 1 este " + sum);

    }


    public void ArmyBattle() {

        int sumaSoldati = 0;
        int sumaSoldati2 = 0;
        int sumaTancuri = 0;
        int sumaTancuri2 = 0;
        int sumaSubmarine = 0;
        int sumaSubmarine2 = 0;




        for (Army soldatArmata1 : arm1) {
            if (soldatArmata1 instanceof Soldati) {
                sumaSoldati = sumaSoldati + soldatArmata1.getFirepower();
            }

        }
        System.out.println("Soldati artmata 1 firepower: " + sumaSoldati);



        for (Army soldatArmata2 : arm2) {
            if (soldatArmata2 instanceof Soldati) {
                sumaSoldati2 = sumaSoldati2 + soldatArmata2.getFirepower();
            }

        }
        System.out.println("Soldati artmata 2 firepower: " + sumaSoldati2);

        for (Army tancuriArmata1 : arm1) {
            if (tancuriArmata1 instanceof Tancuri) {
                sumaTancuri = sumaTancuri + tancuriArmata1.getFirepower();
            }

        }
        System.out.println("Tancuri artmata 1 firepower: " + sumaTancuri);




        for (Army tancruiArmata2 : arm2) {
            if (tancruiArmata2 instanceof Tancuri) {
                sumaTancuri2 = sumaTancuri2 + tancruiArmata2.getFirepower();
            }

        }
        System.out.println("Tancuri artmata 2 firepower: " + sumaTancuri2);


        for (Army submarineArmata1 : arm1) {
            if (submarineArmata1 instanceof Submarine) {
                sumaSubmarine = sumaSubmarine + submarineArmata1.getFirepower();
            }

        }
        System.out.println("Submarine artmata 1 firepower: " + sumaSubmarine);




        for (Army submarineArmata2 : arm2) {
            if (submarineArmata2 instanceof Tancuri) {
                sumaSubmarine2 = sumaSubmarine2 + submarineArmata2.getFirepower();
            }

        }
        System.out.println("Submarine artmata 2 firepower: " + sumaTancuri2);






        int opt = 1;
        while (opt != 0) {


            System.out.println("\n1.Bataie Soldati" +
                    "\n2.Bataie Tancuri" +
                    "\n3.Bataie Submarine");
            Scanner scanner = new Scanner(System.in);
            opt = scanner.nextInt();


            switch (opt) {

                case 1:
                    System.out.println("Acum se bat soldatii ...");
                    int random = new Random().nextInt(2);
                    sumaSoldati = sumaSoldati - sumaSoldati2 * random;
                    random = new Random().nextInt(2);
                    sumaSoldati2 = sumaSoldati2 - sumaSoldati * random;
                    System.out.println("Soldati armata 1 au ramas: " + sumaSoldati);
                    System.out.println("Soldati armata 2 au ramas: " + sumaSoldati2);
                    break;

                case 2:

                    System.out.println("Acum se bat tancurile ...");
                     random = new Random().nextInt(2);
                    sumaTancuri = sumaTancuri - sumaTancuri2 * random;
                    random = new Random().nextInt(2);
                    sumaTancuri2 = sumaTancuri2 - sumaTancuri * random;
                    System.out.println("Tancuri armata 1 au ramas: " + sumaTancuri);
                    System.out.println("Tancuri armata 2 au ramas: " + sumaTancuri2);
                    break;

                case 3:
                    System.out.println("Acum se bat submarinele ...");
                    random = new Random().nextInt(2);
                    sumaSubmarine = sumaSubmarine - sumaSubmarine2 * random;
                    random = new Random().nextInt(2);
                    sumaSubmarine2 = sumaSubmarine2 - sumaSubmarine * random;
                    System.out.println("Submarine armata 1 au ramas: " + sumaSubmarine);
                    System.out.println("Submarine armata 2 au ramas: " + sumaSubmarine2);
                    break;











            }
        }
    }
}



