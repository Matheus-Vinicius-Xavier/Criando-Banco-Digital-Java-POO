package main;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depositar(100);
		cc.sacar(50);
		
		cp.depositar(500);
		cp.sacar(100);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
