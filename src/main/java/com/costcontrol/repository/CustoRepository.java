package com.costcontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.costcontrol.model.Custos;

@Repository
public interface CustoRepository extends JpaRepository<Custos, Long>{

	
	
}
