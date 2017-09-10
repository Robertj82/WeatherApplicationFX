package pl.robertjalocha.weatherapp.model.dao;

import pl.robertjalocha.weatherapp.model.WeatherStat;

import java.util.List;

/**
 * Created by Lenovo on 30.08.2017.
 */
public interface WeatherStatDao {
    void saveStat(WeatherStat weatherStat);
    List<WeatherStat> getLastSixStats(String cityname);
    List<String> getAllCities();
}
