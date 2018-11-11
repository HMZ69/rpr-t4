package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlanStudija {

    private Map<Integer, ArrayList<Predmet>> plan;

    public PlanStudija(Map<Integer, ArrayList<Predmet>> plan) {
        this.plan = plan;
    }

    public Map<Integer, ArrayList<Predmet>> getPlan() {
        return plan;
    }

    public void setPlan(Map<Integer, ArrayList<Predmet>> plan) {
        this.plan = plan;
    }

}
