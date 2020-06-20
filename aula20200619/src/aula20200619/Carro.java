package aula20200619;

public class Carro extends Veiculo {
	
	private String nome;
	private String placa;
	private String cor;


	public Carro(String nome, String placa, String cor) {
		super();
		this.nome = nome;
		this.placa = placa;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}
	
	/*
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}*/


	
	
	
	
	
}
