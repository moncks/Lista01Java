package exercicio17;

public class TestaContaPoupanca {

	public static void main(String[] args) {
		ContaPoupanca poupador1 = new ContaPoupanca(2000.00, 4);
		
		poupador1.imprimir();
		
		ContaPoupanca poupador2 = new ContaPoupanca(3000.00, 4);
		
		poupador2.imprimir();
		
		
		poupador1.setTaxaDeJurosAnual(5.0);
		poupador1.imprimir();
		
		poupador2.setTaxaDeJurosAnual(5.0);
		poupador2.imprimir();
		
		

	}

}
