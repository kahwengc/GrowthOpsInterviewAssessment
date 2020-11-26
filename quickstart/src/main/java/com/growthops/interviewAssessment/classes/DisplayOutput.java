package com.growthops.interviewAssessment.classes;

import com.growthops.interviewAssessment.object.PartnerRewardsConfig;

public class DisplayOutput {
	
	private int flag = 1;
	
	public void displayInfo (PartnerRewardsConfig reward){
		
		//Loop through the objects
        for (int i = 0; i < reward.getBenefitData().size(); i++) {
        	for (int j = 0; j < reward.getBenefitData().get(j).getBenefits().size(); j++) {
        		
        		//Capture the discount in string
        		String discount_Str = reward.getBenefitData().get(i).getBenefits().get(j).getDiscount();
        		
        		//If discount field is not empty, apply replace, trim and parseInt to convert the String value to integer
        		if (discount_Str != "") {
        			int discount_Int = (Integer.parseInt(discount_Str.replace("%", "").trim()));
        			//If discount is more than 20, output the details
        			if (discount_Int > 20) {
        				System.out.println("status#" +flag+ ": " +reward.getBenefitData().get(i).getStatus());
        				System.out.println("category#" +flag+ ": " +reward.getBenefitData().get(i).getBenefits().get(j).getCategory());
        				System.out.println("brand#" +flag+ ": " +reward.getBenefitData().get(i).getBenefits().get(j).getBrand());
        				System.out.println("benefitName#" +flag+ ": " +reward.getBenefitData().get(i).getBenefits().get(j).getBenefitName());
        				System.out.println("discount#" +flag+ ": " +reward.getBenefitData().get(i).getBenefits().get(j).getDiscount() + "\n");
        				flag++;
        			}
        		}	
        	}
        }
	}
	
}
