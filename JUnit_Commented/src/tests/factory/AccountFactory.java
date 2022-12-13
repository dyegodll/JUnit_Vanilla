package tests.factory;

import entities.Account;

//Fábrica de Instancias da Classe Account

public class AccountFactory {

	public static Account createEmptyAccount() {
		return new Account(1L, 0.0);
	}

	public static Account createAccount(Double balance) {
		return new Account(1L, balance);
	}

}
