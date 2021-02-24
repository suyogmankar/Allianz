package com.allianz.CO2.Level.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.allianz.CO2.Level.Model.Reading;

@Repository
public interface LevelRepository extends CrudRepository<Reading, String> {

	List<Reading> findByCity(String city);
}
