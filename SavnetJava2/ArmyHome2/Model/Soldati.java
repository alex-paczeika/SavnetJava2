package Model;

public class Soldati  extends  Army{


    String nume;


    public Soldati( String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Soldati{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public int getFirepower() {
        return 1;
    }



}
