package exercicio13;

import java.text.ParseException;
import java.util.Scanner;

public class TestePerfilDeSaude {

	public static void main(String[] args) throws ParseException {

		PerfilDeSaude pessoa = new PerfilDeSaude();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		pessoa.setNome(sc.next());
		
		System.out.println("Qual seu sobrenome?");
		pessoa.setSobrenome(sc.next());
		
		System.out.println("Qual seu sexo? M/F");
		pessoa.setSexo(sc.next());
		
		System.out.println("Qual a data de Nascimento? Formato(dd/MM/yyy)");
		pessoa.setDataNascimento(sc.next());
		
		System.out.println("Qual a sua altura em metros?");
		pessoa.setAltura(sc.nextDouble());
		
		System.out.println("Qual o seu peso em Kg?");
		pessoa.setPeso(sc.nextDouble());
	
		
		pessoa.imprimir();
	}

}