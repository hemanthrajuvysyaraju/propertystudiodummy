package com.pennnat.propertystudio.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pennnat.propertystudio.model.AppartmentsFloorDTO;
import com.pennnat.propertystudio.repository.ApartmentsFLoorRepository;

@Component
public class AppartmentsFloorDAOImpl implements IAppartmentsFloorDAO {
	@Autowired
	private ApartmentsFLoorRepository repo;

	@Override
	public List<AppartmentsFloorDTO> getAppartmentDetails(Integer projid, Integer aprtid) {
		return repo.findByProjidEqualsAndAprtidEquals(projid, aprtid);
	}

	@Override
	public String updateApartmentFloor(AppartmentsFloorDTO apartment) {
		repo.saveAndFlush(apartment);
		return null;
	}
	
	
}
