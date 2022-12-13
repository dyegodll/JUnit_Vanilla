package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTest {
	
/*
 • Construtor
	- Deve criar o objeto com os dados corretos quando os dados forem válidos
	- Deve lançar IllegalArgumentException quando os dados não forem válidos 
*/
	@Test
	public void constructorShouldGenerateObjectWhenValidArguments() {
		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Financing f = new Financing(totalAmount, income, months);
		Assertions.assertInstanceOf(Financing.class, f);
	}
	
	@Test
	public void constructorShouldThrowExceptionWhenInvalidArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Double totalAmount = 100000.0;
			Double income = 2000.0;
			Integer months = 20;
			new Financing(totalAmount, income, months);
		});
	}

}
