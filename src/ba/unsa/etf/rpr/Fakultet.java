package ba.unsa.etf.rpr;

import java.util.List;

public class Fakultet {
    private List<Student> studenti;
    private List<Predmet> predmeti;

    Fakultet() {}
    Fakultet(List<Student> studenti, List<Predmet> predmeti) {}

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public void kreirajStudenta(String ime, String prezime, int brojIndeksa, int brojECTS) {}

    public void izbrisiStudenta(Student s) {}

    public void kreirajPredmet(String nazivPredmeta, String predmetniProfesor, int brojECTS) {}

    public void izbrisiPredmet(Predmet p) {}

    public void upisiStudenta(Student s, Predmet p) {}

    public void ispisiStudenta(Student s, Predmet p) {}
}
