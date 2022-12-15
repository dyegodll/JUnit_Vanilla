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
	public void constructorShouldGenerateObjectWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Financing(100000.0, 2000.0, 20);
		});
	}

/*
	 • setTotalAmount 
	  	- Deve atualizar o valor quando os dados forem válidos 
	  	- Deve lançar IllegalArgumentException quando os dados não forem válidos
*/
	@Test
	public void setTotalAmountShouldUpdateDataWhenValidArguments() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 50000.0;
		f.setTotalAmount(50000.0);
		Assertions.assertEquals(expectedValue, f.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowsIllegalArgumentExceptionWhenInvalidArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
	}
	
/*
 	• setIncome
		- Deve atualizar o valor quando os dados forem válidos
		- Deve lançar IllegalArgumentException quando os dados não forem válidos
*/
	@Test
	public void setIncomeShouldUpdateDataWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 3000.0;
		f.setIncome(3000.0);
		Assertions.assertEquals(expectedValue, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidAArguments() {
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
	public void setMounthsShouldUpdateDataWhenValidArguments() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		int expectedValue = 81;
		f.setMonths(81);
		Assertions.assertEquals(expectedValue, f.getMonths());
	}
	
	@Test
	public void setMounthsShouldThrowIllegalArgumentExceptionWhenInvalidArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(79);
		});
	}
	
/*
 	• entry
		- Deve calcular corretamente o valor da entrada
*/
	@Test
	public void entryShouldCalculateCorretlyValues() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 20000.0;
		double x = f.entry();
		Assertions.assertEquals(expectedValue, x);
	}
	
/*
 	 • quota
		- Deve calcular corretamente o valor da prestação
*/
	@Test
	public void quotaShouldCalculateCorretlyValues() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 1000.0;
		double x = f.quota();
		Assertions.assertEquals(expectedValue, x);
	}
	
}
