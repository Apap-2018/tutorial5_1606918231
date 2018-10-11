package com.apap.tutorial5.service;

import com.apap.tutorial5.model.PilotModel;
import com.apap.tutorial5.repository.PilotDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 
 * PilotServiceImpl
 *
 */
@Service("pilotService")
@Transactional
public class PilotServiceImpl implements PilotService{
	@Autowired
	private PilotDb pilotDb;

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		return pilotDb.findByLicenseNumber(licenseNumber);
	}

	@Override
	public void addPilot(PilotModel pilot) {
		pilotDb.save(pilot);
		
	}

	@Override
	public void deletePilotById(long id) {
		pilotDb.deleteById(id);
	}

	@Override
	public PilotModel updatePilot(PilotModel pilot) {
		PilotModel resPilot = this.getPilotDetailByLicenseNumber(pilot.getLicenseNumber());

		resPilot.setName(pilot.getName());
		resPilot.setFlyHour(pilot.getFlyHour());
		
		pilotDb.save(resPilot);
		
		return resPilot;
	}
	
	public PilotModel getPilotById(long id) {
		return pilotDb.getOne(id);
	}
	
	
}
