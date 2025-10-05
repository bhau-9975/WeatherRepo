package com.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.entity.WeatherInfo;

@Repository 
public interface WeatherRepository extends JpaRepository<WeatherInfo, Long> {
	
	
	
}
