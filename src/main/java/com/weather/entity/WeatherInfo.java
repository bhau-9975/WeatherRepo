package com.weather.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class WeatherInfo { 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	private String city; 
	private String temperature; 
	@Column(name = "condition")
	private String weatherCondition;
	private LocalDateTime timestamp;
	
	
	public WeatherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeatherInfo(Long id, String city, String temperature, String weatherCondition, LocalDateTime timestamp) {
		super();
		this.id = id;
		this.city = city;
		this.temperature = temperature;
		this.weatherCondition = weatherCondition;
		this.timestamp = timestamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "WeatherInfo [id=" + id + ", city=" + city + ", temperature=" + temperature + ", weatherCondition="
				+ weatherCondition + ", timestamp=" + timestamp + "]";
	}
	
	


	
	
//Getters & Setters

}