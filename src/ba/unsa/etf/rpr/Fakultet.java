package ba.unsa.etf.rpr;

import java.util.*;

public class Fakultet {

    private List<Student> studenti;
    private List<Predmet> predmeti;
    private PlanStudija plan;

    public Fakultet(List<Student> studenti, List<Predmet> predmeti, PlanStudija plan) {
        this.studenti = studenti;
        this.predmeti = predmeti;
        this.plan = plan;
        /*for (Predmet p : this.predmeti) {
            this.plan.getPlan().put(p.getSemestar(), p);
        }*/
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

    public void setPlan(PlanStudija plan) {
        this.plan = plan;
    }

    public void dodajPredmet(Predmet p) {
        this.predmeti.add(p);
        ArrayList<Predmet> pp = new ArrayList<Predmet>();
        for (Predmet pr : this.getPredmeti()) {
            if (pr.getSemestar().equals(p.getSemestar())) {
                pp.add(pr);
                this.plan.getPlan().put(p.getSemestar(), pp);
            }
        }
    }

    public void dodajStudenta(Student s) {
        this.studenti.add(s);
    }

    public void izbrisiStudenta(Student s) {
        for (Student st : this.getStudenti()) {
            if (st.equals(s))
                this.getStudenti().remove(st);
        }
    }

    public void izbrisiPredmet(Predmet p) {
        for (Predmet pr : this.getPredmeti()) {
            if (pr.equals(p))
                this.getPredmeti().remove(pr);
        }
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
        System.out.println(semestar + ". SEMESTAR PREDMETI:\n");
        for(Map.Entry<Integer, ArrayList<Predmet>> entry : this.plan.getPlan().entrySet()) {
            if(entry.getKey().equals(semestar)) {
                for (Predmet p : entry.getValue()) {
                    brojac++;
                    System.out.println(brojac + ". " + p.toString());
                }
            }
        }
    }

    public void ispisStudenataPoPredmetu(Predmet p) {
        System.out.println("Studenti koji slusaju predmet " + p.toString() + ":");
        for (Predmet pr : this.getPredmeti()) {
            if (pr.equals(p))
                pr.ispisStudenata();
        }
    }

    public void ispisStudenataPoSemestru(Integer semestar) {
        int brojac = 0;
        System.out.println(semestar + ". SEMESTAR STUDENTI:\n");
        for(Map.Entry<Integer, ArrayList<Predmet>> entry : this.plan.getPlan().entrySet()) {
            if (entry.getKey().equals(semestar)) {
                for (Predmet p : entry.getValue()) {
                    for (Student s : p.getStudenti()) {
                        brojac++;
                        System.out.println(brojac + ". " + s.toString());
                    }
                }
            }
        }
    }

    public void ispisSvihStudenata() {
        int brojac = 0;
        for (Student s : this.getStudenti()) {
            brojac++;
            System.out.println(brojac + ". " + s.toString());
        }
    }
}