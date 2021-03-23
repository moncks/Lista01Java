package exercicio13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class PerfilDeSaude {
	private String nome, sobrenome, sexo, dataNascimento;
	private double altura, peso, imc, frequencia;
	private int idade;

	public PerfilDeSaude() {

	}

	public PerfilDeSaude(String nome, String sobrenome, String sexo, String dataNascimento, double altura,
			double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
		this.peso = peso;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
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

	public double getIMC() {
		return imc = this.peso / (this.altura * this.altura);
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
				"%nNome: %s %s %nSexo: %s %nData de Nascimento: %s %nIdade: %d %nAltura: %.2fm %nPeso: %.2fkg "
						+ "%nIMC: %.2f %nFrequência cardiaca maxíma: %.0fbpm %nFrequência cardiáca alvo deve estar entre: %.0fbmp e %.0fbpm%n",
				this.getNome(), this.getSobrenome(), this.getSexo(), this.getDataNascimento(), this.getIdade(),
				this.getAltura(), this.getPeso(), this.getIMC(), this.getFrequenciaMaxima(), this.getFrequenciaAlvoInferior(),this.getFrequenciaAlvoSuperior());
	}
}