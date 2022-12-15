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
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Double totalAmount = 100000.0;
			Double income = 2000.0;
			Integer months = 20;
			new Financing(totalAmount, income, months);
		});
	}

/*
	 • setTotalAmount 
	  	- Deve atualizar o valor quando os dados forem válidos 
	  	- Deve lançar IllegalArgumentException quando os dados não forem válidos
*/
	@Test
	public void setTotalAmountShouldUpdateValuesWhenValidArguments() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 50000.0;
		f.setTotalAmount(50000.0);
		Assertions.assertEquals(expectedValue, f.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowsExceptiosWhenInvalidArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(200000.0);
		});
	}
	
/*
 	• setIncome
		- Deve atualizar o valor quando os dados forem válidos
		- Deve lançar IllegalArgumentException quando os dados não forem válidos
*/
	@Test
	public void setIncomeShouldUpdateValuesWhenValidArguments() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 3000.0;
		f.setIncome(3000.0);
		Assertions.assertEquals(expectedValue, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowExceptionWhenInvalidArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1500.0);
		});
	}
	
/*
 	• setMonths
		- Deve atualizar o valor quando os dados forem válidos
		- Deve lançar IllegalArgumentException quando os dados não forem válidos
 
*/
	@Test
	public void setMounthShouldUpdateValuesWhenValidArguments() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		int expectedValue = 100;
		f.setMonths(100);
		Assertions.assertEquals(expectedValue, f.getMonths());
	}
	
	@Test
	public void setMounthShouldThrowExceptionWhenInvalidArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(40);
		});
	}
	
}// end
