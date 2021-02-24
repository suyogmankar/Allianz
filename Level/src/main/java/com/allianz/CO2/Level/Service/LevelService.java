package com.allianz.CO2.Level.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allianz.CO2.Level.Model.Reading;
import com.allianz.CO2.Level.Repository.LevelRepository;

@Service
public class LevelService {
	
	@Autowired
	private LevelRepository levelRepository;
	private Reading reading;
	
	public List<Reading> getCo2Level(String city){
		return levelRepository.findByCity(city);
	}
	
	public Reading addCo2Reading(Reading reading) {
		return levelRepository.save(reading);
	}

}
