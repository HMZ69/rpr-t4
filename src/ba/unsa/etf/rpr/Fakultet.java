package ba.unsa.etf.rpr;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Fakultet {

    private List<Student> studenti;
    private List<Predmet> predmeti;
    private Set<Upis> upisi;

    public Fakultet(List<Student> studenti, List<Predmet> predmeti, Set<Upis> upisi) {
        this.studenti = studenti;
        this.predmeti = predmeti;
        this.upisi = upisi;
    }

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

    public Set<Upis> getUpisi() {
        return upisi;
    }

    public void setUpisi(Set<Upis> upisi) {
        this.upisi = upisi;
    }

    public void dodajStudenta(Student s) {
        this.studenti.add(s);
    }

    public void upisiStudenta(Student s, Predmet p, Integer semestar) {

    }

}