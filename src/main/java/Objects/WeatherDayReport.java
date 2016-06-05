package Objects;

import Objects.Wunderground.History;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Alex, 6/5/2016.
 */
@Entity
@Table(name = "WEATHER_DAY_REPORT", uniqueConstraints = {@UniqueConstraint(columnNames = "ID")})
public class WeatherDayReport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer _id;

    @Column(name = "HISTORY", nullable = false)
    private History _history;

    public History getHistory() {
        return _history;
    }

    public void setHistory(History history) {
        _history = history;
    }


}
