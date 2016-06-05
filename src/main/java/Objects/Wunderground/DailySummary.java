package Objects.Wunderground;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Alex, 6/5/2016.
 */
public class DailySummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer _id;

    private Date _date;
    private String _fog;
    private String _rain;
    private String _snow;
    private String _snowfallm;
    private String _monthtodatesnowfallm;
    private String _since1julsnowfallm;
    private String _snowdepthm;
    private String _hail;
    private String _meantempm;
    private String _thunder;
    private String _tornado;
    private String _meandewptm;
    private String _meanpressurem;
    private String _meanwindspdm;
    private String _meanwdire;
    private String _meanwdird;
    private String _meanvism;
    private String _humidity;
    private String _maxtempm;
    private String _mintempm;
    private String _maxhumidity;
    private String _minhumidity;
    private String _maxdewptm;
    private String _mindewptm;
    private String _maxpressurem;
    private String _minpressurem;
    private String _maxwspdm;
    private String _minwspdm;
    private String _maxvism;
    private String _minvism;
    private String _gdegreedays;
    private String _heatingdegreedays;
    private String _coolingdegreedays;
    private String _precipm;
    private String _precipsource;
    private String _heatingdegreedaysnormal;
    private String _monthtodateheatingdegreedays;
    private String _monthtodateheatingdegreedaysnormal;
    private String _since1sepheatingdegreedays;
    private String _since1sepheatingdegreedaysnormal;
    private String _since1julheatingdegreedays;
    private String _since1julheatingdegreedaysnormal;
    private String _coolingdegreedaysnormal;
    private String _monthtodatecoolingdegreedays;
    private String _monthtodatecoolingdegreedaysnormal;
    private String _since1sepcoolingdegreedays;
    private String _since1sepcoolingdegreedaysnormal;
    private String _since1jancoolingdegreedays;
    private String _since1jancoolingdegreedaysnormal;

    public Date getDate() {
        return _date;
    }

    public void setDate(Date date) {
        _date = date;
    }

    public String getFog() {
        return _fog;
    }

    public void setFog(String fog) {
        _fog = fog;
    }

    public String getRain() {
        return _rain;
    }

    public void setRain(String rain) {
        _rain = rain;
    }

    public String getSnow() {
        return _snow;
    }

    public void setSnow(String snow) {
        _snow = snow;
    }

    public String getSnowfallm() {
        return _snowfallm;
    }

    public void setSnowfallm(String snowfallm) {
        _snowfallm = snowfallm;
    }

    public String getMonthtodatesnowfallm() {
        return _monthtodatesnowfallm;
    }

    public void setMonthtodatesnowfallm(String monthtodatesnowfallm) {
        _monthtodatesnowfallm = monthtodatesnowfallm;
    }

    public String getSince1julsnowfallm() {
        return _since1julsnowfallm;
    }

    public void setSince1julsnowfallm(String since1julsnowfallm) {
        _since1julsnowfallm = since1julsnowfallm;
    }

    public String getSnowdepthm() {
        return _snowdepthm;
    }

    public void setSnowdepthm(String snowdepthm) {
        _snowdepthm = snowdepthm;
    }

    public String getHail() {
        return _hail;
    }

    public void setHail(String hail) {
        _hail = hail;
    }

    public String getMeantempm() {
        return _mintempm;
    }

    public void setMeantempm(String mintempm) {
        _mintempm = mintempm;
    }

    public String getThunder() {
        return _thunder;
    }

    public void setThunder(String thunder) {
        _thunder = thunder;
    }

    public String getTornado() {
        return _tornado;
    }

    public void setTornado(String tornado) {
        _tornado = tornado;
    }

    public String getMeandewptm() {
        return _mindewptm;
    }

    public void setMeandewptm(String mindewptm) {
        _mindewptm = mindewptm;
    }

    public String getMeanpressurem() {
        return _meanpressurem;
    }

    public void setMeanpressurem(String meanpressurem) {
        _meanpressurem = meanpressurem;
    }

    public String getMeanwindspdm() {
        return _meanwindspdm;
    }

    public void setMeanwindspdm(String meanwindspdm) {
        _meanwindspdm = meanwindspdm;
    }

    public String getMeanwdire() {
        return _meanwdire;
    }

    public void setMeanwdire(String meanwdire) {
        _meanwdire = meanwdire;
    }

    public String getMeanwdird() {
        return _meanwdird;
    }

    public void setMeanwdird(String meanwdird) {
        _meanwdird = meanwdird;
    }

    public String getMeanvism() {
        return _meanvism;
    }

    public void setMeanvism(String meanvism) {
        _meanvism = meanvism;
    }

    public String getHumidity() {
        return _humidity;
    }

    public void setHumidity(String humidity) {
        _humidity = humidity;
    }

    public String getMaxtempm() {
        return _maxtempm;
    }

    public void setMaxtempm(String maxtempm) {
        _maxtempm = maxtempm;
    }

    public String getMintempm() {
        return _mintempm;
    }

    public void setMintempm(String mintempm) {
        _mintempm = mintempm;
    }

    public String getMaxhumidity() {
        return _maxhumidity;
    }
    
    public void setMaxhumidity(String maxhumidity) {
        _maxhumidity = maxhumidity;
    }

    public String getMinhumidity() {
        return _minhumidity;
    }
    
    public void setMinhumidity(String minhumidity) {
        _minhumidity = minhumidity;
    }

    public String getMaxdewptm() {
        return _maxdewptm;
    }
    
    public void setMaxdewptm(String maxdewptm) {
        _maxdewptm = maxdewptm;
    }

    public String getMindewptm() {
        return _mindewptm;
    }
    
    public void setMindewptm(String mindewptm) {
        _mindewptm = mindewptm;
    }

    public String getMaxpressurem() {
        return _maxpressurem;
    }
    
    public void setMaxpressurem(String maxpressurem) {
        _maxpressurem = maxpressurem;
    }

    public String getMinpressurem() {
        return _minpressurem;
    }
    
    public void setMinpressurem(String minpressurem) {
        _minpressurem = minpressurem;
    }

    public String getMaxwspdm() {
        return _maxwspdm;
    }
    
    public void setMaxwspdm(String maxwspdm) {
        _maxwspdm = maxwspdm;
    }

    public String getMinwspdm() {
        return _minwspdm;
    }
    
    public void setMinwspdm(String minwspdm) {
        _minwspdm = minwspdm;
    }

    public String getMaxvism() {
        return _maxvism;
    }
    
    public void setMaxvism(String maxvism) {
        _maxvism = maxvism;
    }

    public String getMinvism() {
        return _minvism;
    }
    
    public void setMinvism(String minvism) {
        _minvism = minvism;
    }

    public String getGdegreedays() {
        return _gdegreedays;
    }
    
    public void setGdegreedays(String gdegreedays) {
        _gdegreedays = gdegreedays;
    }

    public String getHeatingdegreedays() {
        return _heatingdegreedays;
    }
    
    public void setHeatingdegreedays(String heatingdegreedays) {
        _heatingdegreedays = heatingdegreedays;
    }

    public String getCoolingdegreedays() {
        return _coolingdegreedays;
    }
    
    public void setCoolingdegreedays(String coolingdegreedays) {
        _coolingdegreedays = coolingdegreedays;
    }

    public String getPrecipm() {
        return _precipm;
    }
    
    public void setPrecipm(String precipm) {
        _precipm = precipm;
    }

    public String getPrecipsource() {
        return _precipsource;
    }
    
    public void setPrecipsource(String precipsource) {
        _precipsource = precipsource;
    }

    public String getHeatingdegreedaysnormal() {
        return _heatingdegreedaysnormal;
    }
    
    public void setHeatingdegreedaysnormal(String heatingdegreedaysnormal) {
        _heatingdegreedaysnormal = heatingdegreedaysnormal;
    }

    public String getMonthtodateheatingdegreedays() {
        return _monthtodateheatingdegreedays;
    }
    
    public void setMonthtodateheatingdegreedays(String monthtodateheatingdegreedays) {
        _monthtodateheatingdegreedays = monthtodateheatingdegreedays;
    }

    public String getMonthtodateheatingdegreedaysnormal() {
        return _monthtodateheatingdegreedaysnormal;
    }
    
    public void setMonthtodateheatingdegreedaysnormal(String monthtodateheatingdegreedaysnormal) {
        _monthtodateheatingdegreedaysnormal = monthtodateheatingdegreedaysnormal;
    }

    public String getSince1sepheatingdegreedays() {
        return _since1sepheatingdegreedays;
    }
    
    public void setSince1sepheatingdegreedays(String since1sepheatingdegreedays) {
        _since1sepheatingdegreedays = since1sepheatingdegreedays;
    }

    public String getSince1sepheatingdegreedaysnormal() {
        return _since1sepheatingdegreedaysnormal;
    }
    
    public void setSince1sepheatingdegreedaysnormal(String since1sepheatingdegreedaysnormal) {
        _since1sepheatingdegreedaysnormal = since1sepheatingdegreedaysnormal;
    }

    public String getSince1julheatingdegreedays() {
        return _since1julheatingdegreedays;
    }
    
    public void setSince1julheatingdegreedays(String since1julheatingdegreedays) {
        _since1julheatingdegreedays = since1julheatingdegreedays;
    }

    public String getSince1julheatingdegreedaysnormal() {
        return _since1julheatingdegreedaysnormal;
    }
    
    public void setSince1julheatingdegreedaysnormal(String since1julheatingdegreedaysnormal) {
        _since1julheatingdegreedaysnormal = since1julheatingdegreedaysnormal;
    }

    public String getCoolingdegreedaysnormal() {
        return _coolingdegreedaysnormal;
    }
    
    public void setCoolingdegreedaysnormal(String coolingdegreedaysnormal) {
        _coolingdegreedaysnormal = coolingdegreedaysnormal;
    }

    public String getMonthtodatecoolingdegreedays() {
        return _monthtodatecoolingdegreedays;
    }
    
    public void setMonthtodatecoolingdegreedays(String monthtodatecoolingdegreedays) {
        _monthtodatecoolingdegreedays = monthtodatecoolingdegreedays;
    }
    
    public String getMonthtodatecoolingdegreedaysnormal() {
        return _monthtodatecoolingdegreedaysnormal;
    }
    
    public void setMonthtodatecoolingdegreedaysnormal(String monthtodatecoolingdegreedaysnormal) {
        _monthtodatecoolingdegreedaysnormal = monthtodatecoolingdegreedaysnormal;
    }
    
    public String getSince1sepcoolingdegreedays() {
        return _since1sepcoolingdegreedays;
    }
    
    public void setSince1sepcoolingdegreedays(String since1sepcoolingdegreedays) {
        _since1sepcoolingdegreedays = since1sepcoolingdegreedays;
    }
    
    public String getSince1sepcoolingdegreedaysnormal() {
        return _since1sepcoolingdegreedaysnormal;
    }
    
    public void setSince1sepcoolingdegreedaysnormal(String since1sepcoolingdegreedaysnormal) {
        _since1sepcoolingdegreedaysnormal = since1sepcoolingdegreedaysnormal;
    }
    
    public String getSince1jancoolingdegreedays() {
        return _since1jancoolingdegreedays;
    }
    
    public void setSince1jancoolingdegreedays(String since1jancoolingdegreedays) {
        _since1jancoolingdegreedays = since1jancoolingdegreedays;
    }
    
    public String getSince1jancoolingdegreedaysnormal() {
        return _since1jancoolingdegreedaysnormal;
    }
    
    public void setSince1jancoolingdegreedaysnormal(String since1jancoolingdegreedaysnormal) {
        _since1jancoolingdegreedaysnormal = since1jancoolingdegreedaysnormal;
    }
    
    
}
