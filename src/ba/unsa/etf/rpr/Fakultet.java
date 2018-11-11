package ba.unsa.etf.rpr;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Fakultet {

    private List<Student> studenti;
    private List<Predmet> predmeti;
    private PlanStudija plan;

    public Fakultet(List<Student> studenti, List<Predmet> predmeti, PlanStudija plan) {
        this.studenti = studenti;
        this.predmeti = predmeti;
        this.plan = plan;
        for (Predmet p : this.predmeti) {
            this.plan.getPlan().put(p.getSemestar(), p);
        }
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

    public void dodajPredmet(Predmet p) {
        this.predmeti.add(p);
    }

    public void dodajStudenta(Student s) {
        this.studenti.add(s);
    }

    public void upisiStudenta(Student s, Predmet p) {
        boolean postoji = false;
        for (Student st : this.getStudenti()) {
            if (st.equals(s)) {
                postoji = true;
                break;
            }
        }
        if (!postoji) {
            System.out.println("Student " + s.getIme() + " " + s.getPrezime() + " nije upisan na fakultet.");
            return;
        }
        postoji = false;
        for (Predmet pr : this.getPredmeti()) {
            if (pr.equals(p)) {
                pr.upisiStudenta(s);
                postoji = true;
                break;
            }
        }
        if (!postoji) {
            System.out.println("Predmet " + p.getNazivPredmeta() + " ne postoji na fakultetu.");
        }
    }

    public void ispisiStudenta(Student s, Predmet p) {
        boolean postoji = false;
        for (Student st : this.getStudenti()) {
            if (st.equals(s)) {
                postoji = true;
                break;
            }
        }
        if (!postoji) {
            System.out.println("Student " + s.getIme() + " " + s.getPrezime() + " nije upisan na fakultet.");
            return;
        }
        postoji = false;
        for (Predmet pr : this.getPredmeti()) {
            if (pr.equals(p)) {
                pr.ispisiStudenta(s);
                postoji = true;
                break;
            }
        }
        if (!postoji) {
            System.out.println("Predmet " + p.getNazivPredmeta() + " ne postoji na fakultetu.");
        }
    }

    public void ispisPredmetaUSemestru(Integer semestar) {
        int brojac = 0;
        for(Map.Entry<Integer, Predmet> entry : this.plan.getPlan().entrySet()) {
            if(entry.getKey().equals(semestar)) {
                brojac++;
                System.out.println(entry.getKey() + ". Semestar:");
                System.out.println(brojac + ". " + entry.getValue().toString());
            }
        }
    }

    public void ispisStudenataPoPredmetu(Predmet p) {
        for (Predmet pr : this.getPredmeti()) {
            if (pr.equals(p))
                pr.ispisStudenata();
        }
    }
}