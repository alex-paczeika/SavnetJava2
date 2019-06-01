package Model;

public class NaveDeRazboi extends  Army{

    String nume;
    int nrDeTunuri;
    int nrDeRachete;

    public NaveDeRazboi(int firepower, String nume, int nrDeTunuri, int nrDeRachete) {
        super(firepower=nrDeTunuri*100+nrDeRachete*100);
        this.nume = nume;
        this.nrDeTunuri = nrDeTunuri;
        this.nrDeRachete = nrDeRachete;
    }

    @Override
    public String toString() {
        return "NaveDeRazboi{" +
                "nume='" + nume + '\'' +
                ", nrDeTunuri=" + nrDeTunuri +
                ", nrDeRachete=" + nrDeRachete +
                ", firepower=" + firepower +
                '}';
    }
}
