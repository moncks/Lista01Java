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
		// System.out.print("Olá " + name + " Sua idade é: ");
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
						+ "%nFrequência cardiaca maxíma: %.0fbpm %nFrequência cardiáca alvo deve estar entre: %.0fbmp e %.0fbpm%n",
				this.getNome(), this.getSobrenome(), this.getDataNascimento(), this.getIdade(),
				this.getFrequenciaMaxima(), this.getFrequenciaAlvoInferior(),this.getFrequenciaAlvoSuperior());
	}
	
	
	

}
/*
Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca
para ver se sua frequência permanece dentro de um intervalo seguro sugerido pelos
seus treinadores e médicos. Segundo a American Heart Association (AHA), 
a fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos. 
Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.

[Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas
e alvo podem variar com base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico 
ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.]

Crie uma classe chamada FrequenciaCardiaca. 
Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa. 
Sua classe deve ter um construtor que receba esses dados como parâmetros. 
Para cada atributo, forneça métodos set e get.

A classe também deve incluir um método que calcule e retorne a idade (em anos), 
um que calcule e retorne a frequência cardíaca máxima 
e um que calcule e retorne a frequência cardíaca alvo da pessoa. 
*/