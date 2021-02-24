package com.allianz.CO2.Level.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allianz.CO2.Level.Model.Reading;
import com.allianz.CO2.Level.Service.LevelService;

@RestController
@RequestMapping("/CO2")
public class LevelController {
	
	@Autowired
	private LevelService levelService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/level/{city}")
	public List<Reading> getCO2Level(@PathParam("city") String city) {
		return levelService.getCo2Level(city);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/reading")
	public Reading postReading(@RequestBody Reading co2Reading) {
		return levelService.addCo2Reading(co2Reading);
	}
}
