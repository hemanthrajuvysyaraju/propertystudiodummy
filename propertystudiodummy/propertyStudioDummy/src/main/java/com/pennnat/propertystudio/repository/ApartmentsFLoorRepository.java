package com.pennnat.propertystudio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pennnat.propertystudio.model.AppartmentsFloorDTO;
@Repository
public interface ApartmentsFLoorRepository extends JpaRepository<AppartmentsFloorDTO, Integer> {
	public List<AppartmentsFloorDTO> findByProjidEqualsAndAprtidEquals(Integer projid,Integer aprtid);
}
