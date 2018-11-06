package ba.unsa.etf.rpr;

import java.util.List;
import java.util.Map;

public class PlanStudija {

    private Map<Integer, List<Predmet>> plan;

    public PlanStudija(Map<Integer, List<Predmet>> plan) {
        this.plan = plan;
    }

    public Map<Integer, List<Predmet>> getPlan() {
        return plan;
    }

    public void setPlan(Map<Integer, List<Predmet>> plan) {
        this.plan = plan;
    }

}
