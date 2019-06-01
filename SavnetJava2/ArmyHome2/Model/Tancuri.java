package Model;

public class Tancuri  extends  Army{

    String nume;
    int nrDeProiectile;
    int nrDeGloante;

    @Override
    public String toString() {
        return "Tancuri{" +
                "nume='" + nume + '\'' +
                ", nrDeProiectile=" + nrDeProiectile +
                ", nrDeGloante=" + nrDeGloante +
                ", firepower=" + firepower +
                '}';
    }

    public Tancuri(int firepower, String nume, int nrDeProiectile, int nrDeGloante) {
        super(firepower=nrDeProiectile*50+nrDeGloante);
        this.nume = nume;
        this.nrDeProiectile = nrDeProiectile;
        this.nrDeGloante = nrDeGloante;
    }


}
