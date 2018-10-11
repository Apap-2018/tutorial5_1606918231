package com.apap.tutorial5.service;

import com.apap.tutorial5.model.FlightModel;
import com.apap.tutorial5.repository.FlightDb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 
 * FlightServiceImpl
 *
 */
@Service("flightService")
@Transactional
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	private FlightDb flightDb;
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);
	}

	@Override
	public void deleteFlightById(long id) {
		flightDb.deleteById(id);
	}

	@Override
	public List<FlightModel> getListFlight() {
		return flightDb.findAll();
	}
	
	

}
