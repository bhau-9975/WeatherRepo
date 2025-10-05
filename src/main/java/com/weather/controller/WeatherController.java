package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.entity.WeatherInfo;
import com.weather.service.WeatherService;

@RestController 
@RequestMapping("/api/weather") 
public class WeatherController { 
	@Autowired 
	private WeatherService service;

@GetMapping("/{city}")
public WeatherInfo getWeather(@PathVariable String city) {
    return service.fetchWeather(city);
}

}