package exercicio10;

public class TestaFatura {

	public static void main(String[] args) {
		Fatura fatura = new Fatura("1", "Produto1", 1, 5.50);
		
		fatura.geraFatura();
		
		fatura.setQuantidade(2);
		fatura.geraFatura();
		
		fatura.setQuantidade(0);
		fatura.geraFatura();
		
		fatura.setQuantidade(2);
		fatura.setPreco(0);
		fatura.geraFatura();
		
		fatura.setDescricao("Produto 2");
		fatura.setNumero("2");
		fatura.setQuantidade(3);
		fatura.setPreco(-2.00);
		fatura.geraFatura();

	}

}

