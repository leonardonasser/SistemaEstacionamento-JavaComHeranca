package aula20200619;

public class Moto extends Veiculo {
	
	private String nome;
	private String placa;
	private int qtdCilindradas;
	
	public Moto(String nome,String placa, int qtdCilindradas) {
		super();
		this.nome = nome;
		this.placa = placa;
		this.qtdCilindradas = qtdCilindradas;
	}

	public String getNome() {
		return nome;
	}

	public String getPlaca() {
		return placa;
	}
	public int getQtdCilindradas() {
		return qtdCilindradas;
	}
	
	
	
	

}
