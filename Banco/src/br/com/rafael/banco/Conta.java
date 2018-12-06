package br.com.rafael.banco;

public class Conta {
	
	private String titular;
	private int numero;
	String agencia;
	private double saldo;
	String dataAbertura;
	private double rendimento;
	
	public Conta() {
		//construtor default
	}
	
	public Conta(String titular) {
		//construtor forçando titulariedade
		this.titular = titular;
	}
	
	
	void saca(double valor) {
		//novo saldo recebe o valor que esta em saldo menos o valor que a pessoa deseja sacar
		//usamos o this para mostrar que é um argumento e não uma simples variavel
		double novoSaldo = this.saldo - valor;
		this.saldo = novoSaldo;
	}
	
	void deposita(double valor) {
		//saldo recebe o valor que a pessoa deseja depositar
		this.saldo += valor;
	}
	
	public double getRendimento() {
		//rendimento mensal é o calculo do saldo x 0.1
		this.rendimento = this.saldo * 0.1;
		return rendimento;
	}
	
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	
	
	String recuperaDadosParaImpressão() {
		String dados = "Titular: "+this.titular;
		dados = "\n Numero: " + this.numero;
		System.out.println("Titular: "+this.titular);
		System.out.println("Conta: "+this.agencia);
		System.out.println("Data: "+this.dataAbertura);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Rendimento Mensal: "+this.getRendimento());
		return dados; 
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
