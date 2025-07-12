package com.insurance_report_app.service;

import java.util.List;

import com.insurance_report_app.dto.SearchRequestDTO;
import com.insurance_report_app.entity.CitizenPlan;

public interface ReportService {
	
	public List<String> getPlanName();
	public List<String> getPlanStatus();
	public List<CitizenPlan> search(SearchRequestDTO requestDTO);
	public boolean exportExcel();
	public boolean exportPdf();
	

}
