package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

//biblioteca org.junit.jupiter.api última versão do JUnit
//Na técnica TDD(Test Driven Development) iniciamos primeiro a implementação da classe Test

public class AccountTest {
	
/*
	 Nomenclatura do método de um teste
	<AÇÃO> should <EFEITO> [when <CENÁRIO>]
*/
	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {

		/*Padrão AAA*/
		
		//Arrange: instancie os objetos necessários
		double amount = 200.0;
		double expectedValueResult = 196.0; 
		Account acc = AccountFactory.createEmptyAccount();
		
		//Act: execute as ações necessárias
		acc.deposit(amount); //o dev implementaria o método com a lógica depois na classe 
		
		//Assert: declare o que deveria acontecer (resultado esperado)
		Assertions.assertEquals(expectedValueResult, acc.getBalance());;
	}
	
	@Test
	public void depositShouldThrowExceptionAndDoNothingWhenNegativeAmount() {
		
		//lança exceção + expressão lambda
		//Assertions.assertThrows( Classe da Exception + .class , () -> { ação } );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Account acc = AccountFactory.createAccount(1000.0);
			acc.deposit(-200.0); //deposito negativo
		} );
	}
	
	@Test
	public void depositShouldThrowExceptionAndDoNothingWhenAmountEqualsZero() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Account acc = AccountFactory.createAccount(1000.0);
			acc.deposit(0.0); //deposito de zero
		});
	}
	
	@Test
	public void fullWithdrawShouldClearBalanceAndReturnValue() {
	
		double initialBalance = 800.0;
		Account acc = AccountFactory.createAccount(initialBalance);
		double expectedValue = 0.0;
		
		double result = acc.fullWithdraw();
		
		Assertions.assertTrue(initialBalance == result); //outra forma de teste
	//	Assertions.assertEquals(initialBalance, result);
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void withdrawShouldDecreaseBalanceWhenSufficientBalance() {

		double amount = 200.0;
		double expectedValue = 9800.0;
		Account acc = AccountFactory.createAccount(10000.0);
		
		acc.withdraw(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void withdrawShouldThrowExceptionAndNotDecreaseBalanceWhenInsufficientBalance() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			double amount = 1000.0;
			double expectedValue = 800.0;
			Account acc = AccountFactory.createAccount(expectedValue); //saldo = 800.0
			acc.withdraw(amount);
		});
	}
	
}
