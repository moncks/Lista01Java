package exercicio14;

public class Retangulo {
	private float comprimento = 1.0f, largura = 1.0f, area, perimetro;
	
	public Retangulo() {
		
	}
	
	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		 if(comprimento > 0.0f && comprimento < 20.0f) {
		this.comprimento = comprimento;
		}
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		if(this.largura > 0.0f && this.largura < 20.0f) {
		this.largura = largura;
		}
	}
	
	public float calcularArea() {
		return area = largura * comprimento;
	}
	
	public float calcularPerimetro() {
		return perimetro = 2 * (largura + comprimento);
	}
	
	 public void imprimir() {
		 System.out.printf("%nComprimento: %.2f %nAltura: %.2f %nArea: %.2f %nPerimetro: %.2f",
				 this.getComprimento(), this.getLargura(), this.calcularArea(), this.calcularPerimetro());
	 }
}
