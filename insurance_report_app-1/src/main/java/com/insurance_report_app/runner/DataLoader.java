package com.insurance_report_app.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.insurance_report_app.entity.CitizenPlan;
import com.insurance_report_app.repository.CitizenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner {

	
// ApplicationRunner - code will be executed only once when our application is started

	@Autowired                           
	CitizenPlanRepo citizenPlanRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		citizenPlanRepo.deleteAll();
		
//		Cash plan data
		
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("John");
		c1.setGender("male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitAmount(50000);
				
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Reason");
				
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Cathy");
		c3.setGender("Female");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(2));
		c3.setBenifitAmount(50000);
		c3.setTerminatedReason("Employed");
				
//		Food plan data
		
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Devid");
		c4.setGender("male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenifitAmount(50000);
				
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Robert");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Property Income");
				
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Orlen");
		c6.setGender("Female");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(2));
		c6.setBenifitAmount(50000);
		c6.setTerminatedReason("Employed");
		

		
//		Medical plan data
		
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Buttler");
		c7.setGender("male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenifitAmount(50000);
				
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Stev");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Property Income");
				
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Neel");
		c9.setGender("Female");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(2));
		c9.setBenifitAmount(50000);
		c9.setTerminatedReason("Employed");
		
//		Employee plan data
		
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Maxwel");
		c10.setGender("male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenifitAmount(50000);
				
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Commins");
		c11.setGender("Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Property Income");
				
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Jully");
		c12.setGender("Female");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(2));
		c12.setBenifitAmount(50000);
		c12.setTerminatedReason("Employed");
		

		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
	
		citizenPlanRepo.saveAll(list);
	}

}
