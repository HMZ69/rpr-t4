package ba.unsa.etf.rpr;

public class Predmet {

    private String nazivPredmeta;
    private boolean obavezan;

    Predmet(String nazivPredmeta, boolean obavezan) {
        this.nazivPredmeta = nazivPredmeta;
        this.obavezan = obavezan;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public boolean isObavezan() {
        return obavezan;
    }

    public void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }
}
