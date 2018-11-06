package ba.unsa.etf.rpr;

import java.util.List;

public abstract class Predmet {
    private String nazivPredmeta;
    private List<Student> upisaniStudenti;
    private String predmetniProfesor;
    private int brojECTS;

    Predmet() {}

    Predmet(String nazivPredmeta, List<Student> upisaniStudenti, String predmetniProfesor, int brojECTS) {
        this.nazivPredmeta = nazivPredmeta;
        this.upisaniStudenti = upisaniStudenti;
        this.predmetniProfesor = predmetniProfesor;
        this.brojECTS = brojECTS;
    }


    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public List<Student> getUpisaniStudenti() {
        return upisaniStudenti;
    }

    public void setUpisaniStudenti(List<Student> upisaniStudenti) {
        this.upisaniStudenti = upisaniStudenti;
    }

    public String getPredmetniProfesor() {
        return predmetniProfesor;
    }

    public void setPredmetniProfesor(String predmetniProfesor) {
        this.predmetniProfesor = predmetniProfesor;
    }

    public int getBrojECTS() {
        return brojECTS;
    }

    public void setBrojECTS(int brojECTS) {
        this.brojECTS = brojECTS;
    }

    public void upisiStudenta(Student s) {}

    public void ispisiStudenta(Student s) {}

    public void ispisiStudente() {}
}
