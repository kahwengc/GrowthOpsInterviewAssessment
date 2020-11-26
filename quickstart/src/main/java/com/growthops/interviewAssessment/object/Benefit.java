package com.growthops.interviewAssessment.object;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Benefit {
	private String category;
	private String brand;
	private String discount;
	private String discountState;
	private String preDiscount;
    private String content;
    private String icon;
    private String iconShopcart;
    private String status;
    private String benefitName;
    private String expireDate;
    private String url;
   
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDiscountState() {
		return discountState;
	}
	public void setDiscountState(String discountState) {
		this.discountState = discountState;
	}
	public String getPreDiscount() {
		return preDiscount;
	}
	public void setPreDiscount(String preDiscount) {
		this.preDiscount = preDiscount;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIconShopcart() {
		return iconShopcart;
	}
	public void setIconShopcart(String iconShopcart) {
		this.iconShopcart = iconShopcart;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBenefitName() {
		return benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

    
}
