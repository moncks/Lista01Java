package exercicio12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestaFrequenciaCardiaca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FrequenciaCardiaca pessoa = new FrequenciaCardiaca();

		System.out.println("Digite seu nome: ");
		//FrequenciaCardiaca.setNome(entrada.nextLine());

		System.out.println("Digite sua Data de Nascimento: ");
		String nascimento = entrada.nextLine();
		try {
			FrequenciaCardiaca.setDataNascimento(sdf.parse(nascimento));
		} catch (ParseException e) {
		System.err.println("Data informada no formato erroado!!!");

		}

		//System.out.println(FrequenciaCardiaca.getNome());
		System.out.println(FrequenciaCardiaca.getDataNascimento());
		System.out.println(FrequenciaCardiaca.getIdade());

	}

}
