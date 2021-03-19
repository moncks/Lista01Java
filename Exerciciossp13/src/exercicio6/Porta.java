package exercicio6;

public class Porta {
	public String cor;
	public double largura, altura, profundidade;
	public boolean aberta;
	
	public Porta(String cor, double largura, double altura, double profundidade, boolean aberta) {
		this.cor = cor;
		this.largura = largura;
		this.altura = altura;
		this.profundidade = profundidade;
		this.aberta = aberta;
		
	}
	
 	public void setAbrir() {
		if(!this.aberta) {
			this.aberta = true;
		}
	}
	
	public boolean getAbrir() {
		return aberta;
	}
	
	public void setFechar() {
		if(this.aberta) {
			this.aberta = false;
		}
	}
	
	public boolean getFechar() {
		return aberta;
	}
	
	public String pinta() {
		return cor;
	}
	
	public String estaAberta() {
		if(this.aberta) {
			return "aberta";
		}else {
			return "fechada";
		}
		
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	
	public double getProfundidade() {
		return profundidade;
	}
	
	public void imprimir() {
		 System.out.printf("A minha porta é da cor %s, e possui de largura %.2fm, de altura %.2fm e de profundidade %.2fm. "
		 		+ "E ela está %s.%n", this.cor, this.largura, this.altura, this.profundidade, this.estaAberta());
		
	}

}