package Model;

public class AvioaneDeLupta  extends  Army{

    String nume;
    int nrDeRachete;
    int nrDeBombe;

    @Override
    public String toString() {
        return "AvioaneDeLupta{" +
                "nume='" + nume + '\'' +
                ", nrDeRachete=" + nrDeRachete +
                ", nrDeBombe=" + nrDeBombe +
                '}';
    }

    public AvioaneDeLupta(String nume, int nrDeRachete, int nrDeBombe) {

        this.nume = nume;
        this.nrDeRachete = nrDeRachete;
        this.nrDeBombe = nrDeBombe;
    }

    @Override
    public int getFirepower() {
        return nrDeRachete*1000+nrDeBombe*2000;
    }
}
