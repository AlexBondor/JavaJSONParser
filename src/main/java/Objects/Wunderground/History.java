package Objects.Wunderground;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex, 6/5/2016.
 */
public class History {
    private Date _date;
    private List<Observation> _observations = new ArrayList<Observation>();
    private List<DailySummary> _dailysummary = new ArrayList<DailySummary>();

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

    public List<DailySummary> getDailysummary() {
        return _dailysummary;
    }

    public void setDailysummary(List<DailySummary> dailysummary) {
        _dailysummary = dailysummary;
    }

    public void addDailysummary(DailySummary dailySummary) {
        _dailysummary.add(dailySummary);
    }
}