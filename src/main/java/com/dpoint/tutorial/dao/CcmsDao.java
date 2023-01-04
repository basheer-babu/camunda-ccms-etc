package com.dpoint.tutorial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dpoint.tutorial.dto.CcmsStore;

@Repository
public interface CcmsDao extends JpaRepository<CcmsStore, Long>{

	List<CcmsStore> findByLevel(String level);

	
	@Modifying
	@Query(value = "update CCMS_DATA c set c.level = :status where c.pro_instance_id = :id",nativeQuery = true)
	int setLevelChange(@Param("status") String status, @Param("id") String id);
}
