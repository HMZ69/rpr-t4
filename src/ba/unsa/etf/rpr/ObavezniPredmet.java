package ba.unsa.etf.rpr;

import java.util.List;

public class ObavezniPredmet extends Predmet {

    ObavezniPredmet(String nazivPredmeta, List<Student> upisaniStudenti, String predmetniProfesor, int brojECTS) {
        super(nazivPredmeta, upisaniStudenti, predmetniProfesor, brojECTS);
    }

}
