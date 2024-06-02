package com.pennnat.propertystudio.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.BindParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pennnat.propertystudio.model.AppartmentsFLoorVo;
import com.pennnat.propertystudio.model.AppartmentsFloorDTO;
import com.pennnat.propertystudio.service.IAppartmentsFloorService;

@Controller
public class appartmentFloorsController {

	private static final Logger logger = LoggerFactory.getLogger(appartmentFloorsController.class);
	@Autowired
	private IAppartmentsFloorService service;

	@GetMapping("/appartmentdetails")
	public String fetchDetails(Model model, @Param(value = "proj_id") Integer proj_id,
			@Param(value = "appartment_id") Integer appartment_id) {
		logger.debug("/appartmentdetails url has been called");
		model.addAttribute("projectid", proj_id);
		model.addAttribute("appartmentid", appartment_id);
		logger.debug("projectid,appartment id has been set to model attribute for appartments.jsp");
		List<AppartmentsFLoorVo> appartmentDetails = service.getAppartmentDetails(proj_id, appartment_id);
		if (appartmentDetails.size() > 0)
			logger.debug("appartment list has been retrived");
		else
			logger.debug("appartment list not got retrived");
		model.addAttribute("appartmentdetails", appartmentDetails);
		return "appartments";
	}

	@GetMapping("/edit")
	public String editController(Model model, @BindParam AppartmentsFloorDTO appartmentfloor) {
		model.addAttribute("appartmentfloor", appartmentfloor);
		return "edit";
	}

	@PostMapping("/updatefloor")
	public String updatefloor(AppartmentsFloorDTO floor, Model model, @RequestParam("floorplan") MultipartFile file,RedirectAttributes redirectAttributes) {
		try {
			floor.setAprtfloorplan(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		service.updateApartmentFloor(floor);
		redirectAttributes.addAllAttributes(Map.of("proj_id",floor.getProjid(),"appartment_id",floor.getAprtid()));
		return "redirect:/appartmentdetails";
	}
}
