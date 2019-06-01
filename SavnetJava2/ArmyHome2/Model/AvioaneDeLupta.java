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
                ", firepower=" + firepower +
                '}';
    }

    public AvioaneDeLupta(int firepower, String nume, int nrDeRachete, int nrDeBombe) {
        super(firepower=nrDeRachete*1000+nrDeBombe*2000);
        this.nume = nume;
        this.nrDeRachete = nrDeRachete;
        this.nrDeBombe = nrDeBombe;
    }
}
