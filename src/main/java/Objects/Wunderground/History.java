package Objects.Wunderground;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex, 6/5/2016.
 */
@Entity
@Table(name = "HISTORY", uniqueConstraints = {@UniqueConstraint(columnNames = "ID")})
public class History implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer _id;

    @Column(name = "DAY", nullable = false)
    private Date _date;

    @Column(name = "OBSERVATIONS", nullable = false)
    private List<Observation> _observations = new ArrayList<Observation>();

    @Column(name = "DAILY_SUMMARY", nullable = false)
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