package pl.robertjalocha.weatherapp.model;

/**
 * Created by Lenovo on 30.08.2017.
 */
public class WeatherStat {
    private String cityname;
    private float temp;

    public WeatherStat(String cityname, float temp) {
        this.cityname = cityname;
        this.temp = temp;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
}
