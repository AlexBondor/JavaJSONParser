package Objects.Wunderground;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex, 6/5/2016.
 */
public class History {
    private Date _date = new Date();
    private List<Observation> _observations = new ArrayList<Observation>();
    private DailySummary _dailysummary = new DailySummary();

    public Date getDate() {
        return _date;
    }

    public void setDate(Date date) {
        _date = date;
    }

    public List<Observation> getObservations() {
        return _observations;
    }

    public void setObservations(List<Observation> observations) {
        _observations = observations;
    }

    public void addObservation(Observation observation) {
        _observations.add(observation);
    }

    public DailySummary getDailysummary() {
        return _dailysummary;
    }

    public void setDailysummary(DailySummary dailysummary) {
        _dailysummary = dailysummary;
    }
}