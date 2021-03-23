package exercicio12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class FrequenciaCardiaca {
	private String nome, sobrenome, dataNascimento;
	private int idade;
	private double frequencia;
	
	
	
	
	public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}
	
	public static Date StringToDate(String dataNascimento) throws ParseException {
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		// Parsing the given String to Date object
		Date date = formatter.parse(dataNascimento);
		System.out.println("Date object value: " + date);
		return date;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() throws ParseException {
		// Converting String to Date
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(this.getDataNascimento());

		// Converting obtained Date object to LocalDate object
		Instant instant = date.toInstant();
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		LocalDate givenDate = zone.toLocalDate();

		// Calculating the difference between given date to current date.
		Period period = Period.between(givenDate, LocalDate.now());
		// System.out.print("Ol� " + name + " Sua idade �: ");
		period.getYears();

		return idade = period.getYears();
	}
	
	public double getFrequenciaMaxima() {
		frequencia = 220 - idade;
		return frequencia;
	}

	public double getFrequenciaAlvoInferior() {
		return frequencia * 0.5;
	}

	public double getFrequenciaAlvoSuperior() {
		return frequencia * 0.85;
	}

	public void imprimir() throws ParseException {
		System.out.printf(
				"%nNome: %s %s %nData de Nascimento: %s %nIdade: %d "
						+ "%nFrequ�ncia cardiaca max�ma: %.0fbpm %nFrequ�ncia cardi�ca alvo deve estar entre: %.0fbmp e %.0fbpm%n",
				this.getNome(), this.getSobrenome(), this.getDataNascimento(), this.getIdade(),
				this.getFrequenciaMaxima(), this.getFrequenciaAlvoInferior(),this.getFrequenciaAlvoSuperior());
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