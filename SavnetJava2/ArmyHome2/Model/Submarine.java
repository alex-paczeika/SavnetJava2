package Model;

public class Submarine extends  Army{

    String nume;
    int nrDeTorpile;

    public Submarine(int firepower, String nume, int nrDeTorpile) {
        super(firepower=nrDeTorpile*500);
        this.nume = nume;
        this.nrDeTorpile = nrDeTorpile;
    }

    @Override
    public String toString() {
        return "Submarine{" +
                "nume='" + nume + '\'' +
                ", nrDeTorpile=" + nrDeTorpile +
                ", firepower=" + firepower +
                '}';
    }
}
