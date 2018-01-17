package com.designPattern.factory;

public class PlanFactory {

	public static Plan getPlan(String planType) {
		if (planType.equals("DOMESTICPLAN"))
			return new DomesticPlan();
		else if (planType.equals("COMMERCIALPLAN"))
			return new CommercialPlan();
		else if (planType.equals("INSTITUTIONALPLAN"))
			return new InstitutionalPlan();
		return null;
	}

}
