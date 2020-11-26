package com.growthops.interviewAssessment.classes;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.growthops.interviewAssessment.object.PartnerRewardsConfig;

public class MainApp 
{
	 public static void main(String[] args) {
		 
		 //Define object mapper 
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		 mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		 
		 //Initialize objects
		 PartnerRewardsConfig reward = new PartnerRewardsConfig();
		 DateFormatter dateTime = new DateFormatter();
		 DisplayOutput output = new DisplayOutput();
		 
	     try {
	    	 //Define file location
	    	 reward = mapper.readValue(new File("C:\\Users\\user\\Desktop\\test.json"), PartnerRewardsConfig.class);
	    	 //Display the details
	    	 output.displayInfo(reward);
	    	 //Display the date
	    	 dateTime.displayDate();
	    	 } catch (IOException e) {
	    		 e.printStackTrace();
	     }
	 }
}
