package Model;

public class NaveDeRazboi extends  Army{

    String nume;
    int nrDeTunuri;
    int nrDeRachete;

    public NaveDeRazboi(String nume, int nrDeTunuri, int nrDeRachete) {
        this.nume = nume;
        this.nrDeTunuri = nrDeTunuri;
        this.nrDeRachete = nrDeRachete;
    }

    @Override
    public String toString() {
        return "NaveDeRazboi : ";
    }


    @Override
    public int getFirepower() {
        return nrDeTunuri*100+nrDeRachete*100;
    }
}
