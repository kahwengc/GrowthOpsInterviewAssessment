package com.growthops.interviewAssessment.object;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PartnerRewardsConfig {
	 
	private String benefitsTotal;
	private List<BenefitData> benefitData;
	
	public String getBenefitsTotal() {
		return benefitsTotal;
	}
	public void setBenefitsTotal(String benefitsTotal) {
		this.benefitsTotal = benefitsTotal;
	}
	public List<BenefitData> getBenefitData() {
		return benefitData;
	}
	public void setBenefitData(List<BenefitData> benefitData) {
		this.benefitData = benefitData;
	}
	
}
