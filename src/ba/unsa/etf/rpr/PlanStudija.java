package ba.unsa.etf.rpr;

import java.util.List;
import java.util.Map;

public class PlanStudija {

    private Map<Integer, Predmet> plan;

    public PlanStudija(Map<Integer, Predmet> plan) {
        this.plan = plan;
    }

    public Map<Integer, Predmet> getPlan() {
        return plan;
    }

    public void setPlan(Map<Integer, Predmet> plan) {
        this.plan = plan;
    }

}
