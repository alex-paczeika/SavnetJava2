package Model;

public class Soldati  extends  Army{


    String nume;


    public Soldati(int firepower,String nume) {
        super(firepower=1);
        this.nume=nume;
    }

    @Override
    public String toString() {
        return "Soldati{" +
                "nume='" + nume + '\'' +
                ", firepower=" + firepower +
                '}';
    }



}
