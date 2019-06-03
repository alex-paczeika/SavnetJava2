package Model;

public class Tancuri  extends  Army{

    String nume;
    int nrDeProiectile;
    int nrDeGloante;

    @Override
    public String toString() {
        return "Tancuri : ";
    }

    public Tancuri( String nume, int nrDeProiectile, int nrDeGloante) {

        this.nume = nume;
        this.nrDeProiectile = nrDeProiectile;
        this.nrDeGloante = nrDeGloante;
    }


    @Override
    public int getFirepower() {
        return nrDeProiectile * 50 + nrDeGloante;
    }
}
