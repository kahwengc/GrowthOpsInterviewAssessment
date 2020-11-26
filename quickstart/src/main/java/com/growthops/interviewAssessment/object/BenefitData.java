package com.growthops.interviewAssessment.object;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BenefitData {
	
	private String status;
	private List<Benefit> benefits;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Benefit> getBenefits() {
		return benefits;
	}
	public void setBenefits(List<Benefit> benefits) {
		this.benefits = benefits;
	}
	


}
