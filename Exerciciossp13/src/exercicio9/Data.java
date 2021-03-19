package exercicio9;

public class Data {
	public int mes, dia, ano;
	
	public Data(int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getDia() {
		return this.dia;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void exibirData() {
		System.out.printf("A data é %d/%d/%d %n",  this.getDia(), this.getMes(), this.getAno());
	}

}
