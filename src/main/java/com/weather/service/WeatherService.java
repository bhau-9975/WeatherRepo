package com.weather.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

import com.weather.entity.WeatherInfo;
import com.weather.repository.WeatherRepository;

@Service 
public class WeatherService { 
	@Autowired 
	private WeatherRepository repo;

public WeatherInfo fetchWeather(String city) {
    String apiKey = "your_api_key";
    String url = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + city;

    RestTemplate rt = new RestTemplate();
    String json = rt.getForObject(url, String.class);

    JSONObject obj = new JSONObject(json);
    JSONObject current = obj.getJSONObject("current");
    JSONObject condition = current.getJSONObject("condition");

    WeatherInfo info = new WeatherInfo();
    info.setCity(city);
    info.setTemperature(current.get("temp_c") + " °C");
    info.setWeatherCondition(condition.getString("text"));
    info.setTimestamp(LocalDateTime.now());

    return repo.save(info);
}

}