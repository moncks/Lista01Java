package exercicio10;

public class Fatura {
	public String numero, descricao;
	public int quantidade;
	public double preco;
	
	public Fatura(String numero, String descricao, int quantidade, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = (int) validaNumeroPositivo(quantidade);
		this.preco = validaNumeroPositivo(preco);
		
	}
	
	private double validaNumeroPositivo(double valorNumerico) {
		if(valorNumerico < 0) {
			return 0;
		} else {
			return valorNumerico;
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = (int) validaNumeroPositivo(quantidade);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = validaNumeroPositivo(preco);
	}
	
	public double getValorFatura() {
		
		return this.preco * this.quantidade;
	}
	
	public void geraFatura() {
		System.out.printf("%nProduto: %s %nCódigo: %s %nQuantidade: %d %nPreço: R$%.2f %nTotal: R$%.2f %n", 
				this.getDescricao(), this.getNumero(), this.getQuantidade(), this.getPreco(), this.getValorFatura());
	}

}