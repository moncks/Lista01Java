package exercicio11;

public class Funcionario {
	public String nome, sobrenome;
	public double salario, aumento;
	
	public Funcionario(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salarioPositivo(salario);
	}
	
	private double salarioPositivo(double salarioPositivo) {
		if(salarioPositivo < 0) {
			return 0;
		}else {
			return salarioPositivo;
		}
	}
	
	public double calcularAumento(double valor) {
		if(valor > 0) {
			aumento = valor / 100.0;
			aumento = aumento * salario;
			return aumento;
		}
		return 0;
	}
		
	public double getAumento() {
		return aumento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario + this.getAumento();
	}

	public void setSalario(double salario) {
		this.salario = salarioPositivo(salario);
	}
	
	public void imprimirFuncionario() {
		System.out.printf("%n Funcionário: %s %s %n Salário: R$%.2f%n", this.getNome(), this.getSobrenome(), this.getSalario());
	}
	
	public void teste() {
		System.out.printf("%n Valor do aumento: %.2f %n Salario:R$%.2f %n ", this.getAumento(), this.getSalario());
	}
	
	
	

}