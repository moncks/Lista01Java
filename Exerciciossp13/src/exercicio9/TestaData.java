package exercicio9;

public class TestaData {

	public static void main(String[] args) {
		Data data = new Data(03,19,2021);
		
		data.exibirData();
		
		data.setDia(13);
		data.setMes(10);
		data.setAno(1990);
		
		data.exibirData();

	}

}