package Model;

public class Submarine extends  Army{

    String nume;
    int nrDeTorpile;

    public Submarine(String nume, int nrDeTorpile) {

        this.nume = nume;
        this.nrDeTorpile = nrDeTorpile;
    }

    @Override
    public String toString() {
        return "Submarine{" +
                "nume='" + nume + '\'' +
                ", nrDeTorpile=" + nrDeTorpile +

                '}';
    }

    @Override
    public int getFirepower() {
        return nrDeTorpile*500;
    }
}
