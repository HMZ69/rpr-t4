package ba.unsa.etf.rpr;

import java.util.List;

public class Predmet {

    private List<Student> studenti;
    private String nazivPredmeta;
    private Integer semestar;
    private boolean obavezan;

    Predmet(List<Student> studenti, String nazivPredmeta, Integer semestar, boolean obavezan) {
        this.nazivPredmeta = nazivPredmeta;
        this.obavezan = obavezan;
        this.studenti = studenti;
        this.semestar = semestar;
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

    public Integer getSemestar() {
        return semestar;
    }

    public void setSemestar(Integer semestar) {
        this.semestar = semestar;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void upisiStudenta(Student s) {
        this.studenti.add(s);
    }

    public void ispisiStudenta(Student s) {
        for (Student st : this.getStudenti())
            if (st.equals(s))
                this.getStudenti().remove(st);
    }

    public void ispisStudenata() {
        int brojac = 0;
        for (Student st : this.getStudenti()) {
            brojac++;
            System.out.println(brojac + ". " + st.toString());
        }
    }

    @Override
    public String toString() {
        return this.getNazivPredmeta();
    }
}
