package com.designpatterns.factory;

// factory class
public class GetPlanFactory {

	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTIUC")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIAL")) {
			return new CommercialPlan();
		}
		return null;
	}
}
