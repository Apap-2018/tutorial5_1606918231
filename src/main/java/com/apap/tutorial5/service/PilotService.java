package com.apap.tutorial5.service;
import org.springframework.stereotype.Service;

import com.apap.tutorial5.model.PilotModel;

/**
 * 
 * PilotService
 *
 */

@Service
public interface PilotService {
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	void addPilot(PilotModel pilot);
	void deletePilotById(long id);
	PilotModel updatePilot(PilotModel pilot);
}
