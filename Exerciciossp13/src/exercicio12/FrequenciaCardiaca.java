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