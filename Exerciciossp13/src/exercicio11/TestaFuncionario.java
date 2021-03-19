package exercicio11;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Brayan","Moncks", 2000.00);
		Funcionario funcionario2 = new Funcionario("Priscila","Caimi", 3000.00);
		
		funcionario1.imprimirFuncionario();
		funcionario2.imprimirFuncionario();
		
		funcionario1.calcularAumento(10);
		funcionario2.calcularAumento(10);
		funcionario1.imprimirFuncionario();
		funcionario2.imprimirFuncionario();

	}

}