package com.pennnat.propertystudio.service;

import java.util.List;

import com.pennnat.propertystudio.model.AppartmentsFLoorVo;
import com.pennnat.propertystudio.model.AppartmentsFloorDTO;

public interface IAppartmentsFloorService {
	public List<AppartmentsFLoorVo> getAppartmentDetails(Integer projid ,Integer aprtid);
	public String updateApartmentFloor(AppartmentsFloorDTO apartment);
}
