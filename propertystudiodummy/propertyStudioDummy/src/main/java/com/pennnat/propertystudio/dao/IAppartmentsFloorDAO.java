package com.pennnat.propertystudio.dao;

import java.util.List;

import com.pennnat.propertystudio.model.AppartmentsFloorDTO;

public interface IAppartmentsFloorDAO {
	public List<AppartmentsFloorDTO> getAppartmentDetails(Integer projid ,Integer aprtid);
	public String updateApartmentFloor(AppartmentsFloorDTO apartment);
}
