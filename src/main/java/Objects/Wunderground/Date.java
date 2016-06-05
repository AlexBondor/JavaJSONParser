package Objects.Wunderground;

/**
 * @author Alex, 6/5/2016.
 */
public class Date {
    private String _pretty;
    private String _year;
    private String _mon;
    private String _mday;
    private String _hour;
    private String _min;
    private String _tzname;

    public String getPretty() {
        return _pretty;
    }

    public void setPretty(String pretty) {
        _pretty = pretty;
    }

    public String getYear() {
        return _year;
    }

    public void setYear(String year) {
        _year = year;
    }

    public String getMon() {
        return _mon;
    }

    public void setMon(String mon) {
        _mon = mon;
    }

    public String getMday() {
        return _mday;
    }

    public void setMday(String mday) {
        _mday = mday;
    }

    public String getHour() {
        return _hour;
    }

    public void setHour(String hour) {
        _hour = hour;
    }

    public String getMin() {
        return _min;
    }

    public void setMin(String min) {
        _min = min;
    }

    public String getTzname() {
        return _tzname;
    }

    public void setTzname(String tzname) {
        _tzname = tzname;
    }
}
