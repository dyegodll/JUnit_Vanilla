package factory.entities;

import entities.Financing;

public class FinancingFactory {
	
	public static Financing createFinancingEmpty() {
		return new Financing(0.0, 0.0, 0);
	}

	public static Financing createFinancing(Double totalAmount, Double income, Integer months) {
		return new Financing(totalAmount, income, months);
	}
}
