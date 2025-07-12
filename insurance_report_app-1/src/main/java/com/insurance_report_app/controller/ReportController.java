package com.insurance_report_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.insurance_report_app.dto.SearchRequestDTO;
import com.insurance_report_app.entity.CitizenPlan;
import com.insurance_report_app.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@PostMapping("/searchReq")
	public String searchHandling(SearchRequestDTO requestDTO, Model model) {
		
		System.out.println(requestDTO);
		
		List<CitizenPlan> citizenPlan = reportService.search(requestDTO);
		model.addAttribute("listInfo", citizenPlan);
		
		init(model);

		return "index";
	}
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		init(model);
				
		return "index";	
	}

	private void init(Model model) {
		
//		SearchRequestDTO requestDTO = new SearchRequestDTO();
//		model.addAttribute("search", requestDTO);
		
		model.addAttribute("search", new SearchRequestDTO());
		model.addAttribute("names", reportService.getPlanName());
		model.addAttribute("status", reportService.getPlanStatus());
	}
	


}
