package exercicio12;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class FrequenciaCardiaca {
	public String nome, sobrenome;
	public Date dataNascimento;
	private ZoneId ZONEID = ZoneId.of("America/Sao_Paulo");
	//public LocalDate dataAtual = new Date();
	
	/*public FrequenciaCardiaca(String nome, String sobrenome, Date dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}*/

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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public static void setDataNascimento(Date dataNascimento) {
		dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		int idade = 0;
		LocalDate dataHoje = LocalDate.now();
		if(this.dataNascimento != null) {
			LocalDate dtNascimento = ZonedDateTime.ofInstant(dataNascimento.toInstant(), ZONEID).toLocalDate();
			Period dif = dtNascimento.until(dataHoje);
			idade = dif.getYears();
		}
		return idade;
	}
	
	
	

}
/*
Ao fazer exerc�cios f�sicos, voc� pode utilizar um monitor de frequ�ncia card�aca
para ver se sua frequ�ncia permanece dentro de um intervalo seguro sugerido pelos
seus treinadores e m�dicos. Segundo a American Heart Association (AHA), 
a f�rmula para calcular a frequ�ncia card�aca m�xima por minuto � 220 menos a idade em anos. 
Sua frequ�ncia card�aca alvo � um intervalo entre 50-85% da sua frequ�ncia card�aca m�xima.

[Observa��o: essas f�rmulas s�o estimativas fornecidas pela AHA. As frequ�ncias card�acas m�ximas
e alvo podem variar com base na sa�de, capacidade f�sica e sexo da pessoa. Sempre consulte um m�dico 
ou profissional de sa�de qualificado antes de come�ar ou modificar um programa de exerc�cios f�sicos.]

Crie uma classe chamada FrequenciaCardiaca. 
Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa. 
Sua classe deve ter um construtor que receba esses dados como par�metros. 
Para cada atributo, forne�a m�todos set e get.

A classe tamb�m deve incluir um m�todo que calcule e retorne a idade (em anos), 
um que calcule e retorne a frequ�ncia card�aca m�xima 
e um que calcule e retorne a frequ�ncia card�aca alvo da pessoa. 
*/