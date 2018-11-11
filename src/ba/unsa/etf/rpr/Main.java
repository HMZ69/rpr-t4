package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<Student>();
        List<Predmet> predmeti = new ArrayList<Predmet>();
	    Student s1 = new Student("Hamza", "Muminovic", 17543);
	    Student s2 = new Student("Meho", "Mehic", 17555);
	    Student s3 = new Student("Sara", "Saric", 18555);
	    Student s4 = new Student("Student", "Studentic", 19444);
	    Predmet p1 = new Predmet(new ArrayList<Student>(), "Matematika 1", 1, true);
	    Predmet p2 = new Predmet(new ArrayList<Student>(), "Fizika 2", 2, true);
	    Predmet p3 = new Predmet(new ArrayList<Student>(), "Mehatronika", 6, true);
	    Predmet p4 = new Predmet(new ArrayList<Student>(), "RPR", 5, false);
	    Predmet p5 = new Predmet(new ArrayList<Student>(), "Matematika 2", 2, true);
	    //Predmet p5 = new Predmet()
        PlanStudija p = new PlanStudija(new HashMap<Integer, ArrayList<Predmet>>());
	    Fakultet f = new Fakultet(studenti, predmeti, p);
	    f.dodajStudenta(s1);
	    f.dodajStudenta(s2);
        f.dodajStudenta(s3);
        f.dodajStudenta(s4);
        f.dodajPredmet(p1);
        f.dodajPredmet(p2);
        f.dodajPredmet(p3);
        f.dodajPredmet(p4);
        f.dodajPredmet(p5);
        //f.ispisSvihStudenata();
        f.upisiStudenta(s1,p1);
        f.upisiStudenta(s2,p1);
        f.upisiStudenta(s3,p4);
        f.upisiStudenta(s1,p2);
        f.upisiStudenta(s3,p3);
        f.upisiStudenta(s4,p4);
        //f.ispisStudenataPoPredmetu(p4);
        f.ispisPredmetaUSemestru(2);
    }
}
