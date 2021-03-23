package exercicio17;

public class ContaPoupanca {
	private static double taxaDeJurosAnual = 10;
	private double saldo, jurosMensal;
	
	public ContaPoupanca(double saldo) {
		this.saldo = saldo;
		
	}

	public double getTaxaDeJurosAnual() {
		taxaDeJurosAnual = taxaDeJurosAnual/100;
		return taxaDeJurosAnual;
	}

	public static void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void calcularJurosMensal(double jurosMensal) {
		;
	}
	
	public double getJurosMensal() {
		jurosMensal = (saldo * taxaDeJurosAnual)/12;
		return jurosMensal;
	}
	
	public static void alterarTaxaAnual(double novaTaxa) {
		ContaPoupanca.taxaDeJurosAnual = novaTaxa;
	}
	
	public void imprimir() {
		System.out.printf("%nSaldo: R$%.2f %nJuros Anual: %.2f %nJuros Mensal: %.2f", this.getSaldo(), this.getTaxaDeJurosAnual(), this.getJurosMensal());
	}

}
/*
Crie uma classe ContaPoupanca. 
Utilize uma variável static “taxaDeJurosAnual” para armazenar a taxa de juros anual para todos os correntistas.
Cada objeto da classe contém uma variável de instância private “saldo” 
para indicar a quantidade que o poupador atualmente tem em depósito. 

Forneça o método “calcularJuroMensal” para calcular os juros mensais 
multiplicando o “saldo” por “taxaDeJurosAnual” dividido por 12 — esses juros devem ser adicionados ao “saldo”. 
Forneça um método static “alterarTaxaAnual” que configure o “taxaDeJurosAnual” com um novo valor.
*/ 