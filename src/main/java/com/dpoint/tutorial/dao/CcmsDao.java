package com.dpoint.tutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpoint.tutorial.dto.CcmsStore;

public interface CcmsDao extends JpaRepository<CcmsStore, Long>{

	
}
