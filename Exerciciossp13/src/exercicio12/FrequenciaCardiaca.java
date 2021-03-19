package exercicio12;

public class FrequenciaCardiaca {
	public String nome, sobrenome, dataNascimento;
	
	public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
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