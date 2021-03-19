package exercicio6;

public class TestaPorta {

	public static void main(String[] args) {
		Porta porta1 = new Porta("rosa", 2.00, 2.10, 0.50, false);
		
			
		porta1.imprimir();
		
		porta1.cor = "azul";
		porta1.setLargura(1.99);
		porta1.setAltura(2.09);
		porta1.setProfundidade(0.60);
		porta1.setAbrir();
		
		porta1.imprimir();
		
		porta1.setFechar();
		
		porta1.imprimir();
		
		
		porta1.cor = "amarela";
		porta1.setLargura(2.00);
		porta1.setAltura(2.15);
		porta1.setProfundidade(0.60);
		porta1.setFechar();
		
		
		porta1.imprimir();
		
		
	}
}
