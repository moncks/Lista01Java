package exercicio17;

public class ContaPoupanca {
	private static double taxaDeJurosAnual;
	private double saldo, jurosMensal;
	
	public ContaPoupanca(double saldo, double taxaDeJurosAnual) {
		this.saldo = saldo;
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
		
	}

	public double getTaxaDeJurosAnual() {
		taxaDeJurosAnual = taxaDeJurosAnual/100;
		return taxaDeJurosAnual;
	}

	public void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double calcularJurosMensal() {
		return jurosMensal = saldo * taxaDeJurosAnual / 12;
	}
	
	public double getSaldoAtualizado() {
		return saldo + jurosMensal;
	}
	public double getJurosMensal() {
		jurosMensal = (saldo * taxaDeJurosAnual)/12;
		return jurosMensal;
	}
	
	public static void alterarTaxaAnual(double novaTaxa) {
		ContaPoupanca.taxaDeJurosAnual = novaTaxa;
	}
	
	public void imprimir() {
		System.out.printf("%nSaldo: R$%.2f %nJuros Anual: %.2f %nJuros Mensal: %.2f %nSaldo Atualizado: R$%.2f %n", this.getSaldo(), this.getTaxaDeJurosAnual(), this.getJurosMensal(), this.getSaldoAtualizado());
	}

}
/*
Crie uma classe ContaPoupanca. 
Utilize uma vari?vel static ?taxaDeJurosAnual? para armazenar a taxa de juros anual para todos os correntistas.
Cada objeto da classe cont?m uma vari?vel de inst?ncia private ?saldo? 
para indicar a quantidade que o poupador atualmente tem em dep?sito. 

Forne?a o m?todo ?calcularJuroMensal? para calcular os juros mensais 
multiplicando o ?saldo? por ?taxaDeJurosAnual? dividido por 12 ? esses juros devem ser adicionados ao ?saldo?. 
Forne?a um m?todo static ?alterarTaxaAnual? que configure o ?taxaDeJurosAnual? com um novo valor.
*/ 