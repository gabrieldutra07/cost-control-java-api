package com.costcontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.costcontrol.model.Custos;
import com.costcontrol.repository.CustoRepository;

@RestController
@RequestMapping("/cost")
public class CostController {
	
	@Autowired
	private CustoRepository custoRepository;

	@GetMapping
	 public List<Custos> listarCustos() {
		 return custoRepository.findAll();
	 }
	
}
