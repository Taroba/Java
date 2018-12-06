package br.com.rafael.banco;

public class Banco {
	
	public static void main(String[] args) {
		String cTitular = "Rafael";
		Conta conta1 = new Conta(cTitular);

		conta1.setTitular("Rafael");
		conta1.setNumero(1);
		conta1.agencia = "itirapina";
		conta1.setSaldo(100.0);
		conta1.dataAbertura = "14/07/2016";
		
		System.out.println("Saldo Conta"+conta1.getSaldo());
		
		conta1.deposita(100);
		System.out.println("Saldo da Conta Apos Deposito: "+conta1.getSaldo());
		System.out.println("Rendimento Mensal: "+conta1.getRendimento());
		
		conta1.saca(50);
		System.out.println("Saldo Apos o Saque: \n"+conta1.getSaldo());
		
		System.out.println(conta1.recuperaDadosParaImpressão());
		
	}

}
