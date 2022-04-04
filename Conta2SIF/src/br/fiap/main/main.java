package br.fiap.main;

import br.fiap.cliente.Cliente;
import br.fiap.conta.Conta;

public class main {

	public static void main(String[] args) {

		Conta[] conta = new Conta[3];
		conta[0] = new Conta(new Cliente("123", "Joao"), 1000);
		conta[1] = new Conta(new Cliente("456", "Maria"), 5000);
		conta[2] = new Conta(new Cliente("789", "Jose"), 2000);
		
		int cpf[] = new int[3];
		String nome[] = new String[3];
		
		for(Conta c : conta) {
			System.out.println(c.getDados());
		}
		
	}

}
