package com.pennnat.propertystudio.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennnat.propertystudio.dao.IAppartmentsFloorDAO;
import com.pennnat.propertystudio.model.AppartmentsFLoorVo;
import com.pennnat.propertystudio.model.AppartmentsFloorDTO;
@Service
public class AppartmentsFloorServiceImpl implements IAppartmentsFloorService {

	@Autowired
	private IAppartmentsFloorDAO dao;
	@Override
	public List<AppartmentsFLoorVo> getAppartmentDetails(Integer projid, Integer aprtid) {
		List<AppartmentsFLoorVo> volist= new ArrayList<>();
		dao.getAppartmentDetails(projid, aprtid).forEach(e->{
			AppartmentsFLoorVo vo = new AppartmentsFLoorVo();
			BeanUtils.copyProperties(e,vo);
			vo.setAprtfloorplanbase64format("data:image/jpeg;base64,"+Base64.getEncoder().encodeToString(e.getAprtfloorplan()));
			volist.add(vo);
		});
		return volist;
	}

	@Override
	public String updateApartmentFloor(AppartmentsFloorDTO apartment) {
		apartment.setAprtlaudate(LocalDateTime.now());
		return dao.updateApartmentFloor(apartment);
	}

}
