package pl.robertjalocha.weatherapp.model.service;

import pl.robertjalocha.weatherapp.model.WeatherData;

/**
 * Created by Lenovo on 21.08.2017.
 */
public interface IWeatherObserver {
    void onWeatherUpdate(WeatherData data);
}
