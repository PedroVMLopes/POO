package br.fiap.conta;
import br.fiap.cliente.*;

public class Conta {

	private Cliente cliente;
	private double saldo;
	
	//Método Construtor
	public Conta(Cliente cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getDados() {	
		String aux = "";
		aux += "CPF: " + cliente.getCpf() + "\n";
		aux += "Nome: " + cliente.getNome() + "\n";
		aux += "Saldo R$ " + saldo;
		
		return aux;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
}
