package execicio7;

public class TestaConta {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Brayan", 123456, 1, 100.01, -100.00, "17/03/2021");
		
		conta.imprimirDados();
		
		conta.sacar(100);
		
		conta.imprimirDados();
		
		conta.depositar(50);
		
		conta.imprimirDados();
		
		conta.sacar(153);
		
		conta.imprimirDados();
	}

}

//(String nomeDoTitular, int numero, int agencia, double saldo, double limite, String dataDeAbertura)
/*
 * Crie uma outra classe chamada TestaConta, contendo um método “main”, 
 * para testar as funcionalidades da classe ContaBancaria.
 */