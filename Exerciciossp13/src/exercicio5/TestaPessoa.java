package exercicio5;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa novaPessoa = new Pessoa("Brayan", 30);
		
		System.out.printf("O nome da pessoa � %s e a idade � %d . %n", novaPessoa.nome, novaPessoa.idade);
		
		novaPessoa.fazAniversario();
		
		System.out.printf("O nome da pessoa � %s e a idade depois de fazer anivers�rio � %d . %n", novaPessoa.nome, novaPessoa.idade);
	}

}


