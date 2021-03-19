package execicio7e8;

public class TestaConta {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Brayan", 123456, 1, 100.01, 100.00, "17/03/2021");
		
		conta.recuperaDadosParaImpressao();
				
		conta.imprimirDados();
		
		conta.sacar(101);
		
		conta.imprimirDados();
		
		conta.depositar(50);
		
		conta.imprimirDados();
		
		conta.sacar(130);
		
		conta.imprimirDados();
		
		conta.recuperaDadosParaImpressao();
		
		conta.imprimirDados();
		
		conta.sacar(101);
		
		conta.imprimirDados();
		
		conta.depositar(50);
		
		conta.imprimirDados();
		
		conta.sacar(130);
		
		conta.imprimirDados();
	}

}

