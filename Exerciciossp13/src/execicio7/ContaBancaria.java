package execicio7;

public class ContaBancaria {
	private String nomeDoTitular, dataDeAbertura;
	private int numero, agencia;
	private double saldo, limite;
	
	public ContaBancaria(String nomeDoTitular, int numero, int agencia, double saldo, double limite, String dataDeAbertura) {
		this.nomeDoTitular = nomeDoTitular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo - valor >= limite) {
			 this.saldo -= valor;
			 System.out.printf("O valor de R$%.2f foi sacado com sucesso!%n", valor);
			 return true;
		}
		System.out.println("Saldo insuficiente!");
		return false;
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.printf("O valor de R$%.2f foi depositado com sucesso!%n", valor);
			return true;
		}
		return false;
	}
	
	public void setSaldo(double valor) {
		if(this.sacar(valor)) {
			saldo-= valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void imprimirDados() {
		System.out.printf("O titular da conta é %s o número da conta é %d-%d, seu saldo no momento é de R$%.2f e seu limite de saque é R$%.2f. %n",
				this.nomeDoTitular, this.numero, this.agencia, this.getSaldo(), this.limite);
	}


}

	
/*
 * Crie uma classe chamada ContaBancaria que contenha os atributos:
 *  nomeDoTitular (String), numero (int), agencia (int), saldo (double),
 *   limite (double) e data de abertura (String). 
 */

/*
 * Essa classe deve realizar as seguintes operações: 
 * sacar (retira valor do saldo, respeitando o limite), 
 * depositar (adiciona valor ao saldo), 
 * verificaSaldo (retorna o valor atual do saldo). 
 */