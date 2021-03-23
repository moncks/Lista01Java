package exercicio16;

public class PessoaFisica {
	private String nome, sobrenome, cpf;

	public PessoaFisica(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
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

	public String getCpf() {
		if (this.getTamanho() == 11) {
			return cpf;
		} else

		{
			return "CPF invalido";

		}
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void validaCPF() {

	}

	public int getTamanho() {
		return cpf.length();
	}

	public void imprimir() {
		System.out.printf("%nNome: %s %s %nCPF: %s", this.getNome(), this.getSobrenome(), this.getCpf());
	}

}

/*
 * Crie uma classe PessoaFisica e pense em quais atributos ela deve possuir. Um
 * deles, obrigatoriamente, ser� o CPF. Garanta que nenhuma pessoa f�sica seja
 * criada sem um CPF, e que nenhuma pessoa f�sica possua um CPF inv�lido. (N�o �
 * preciso criar o algoritmo de valida��o de CPF, apenas a assinatura do m�todo)
 */