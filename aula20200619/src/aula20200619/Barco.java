package aula20200619;

public class Barco extends Veiculo {
	
	private String nome;
	private int potenciaMotor;
	
	
	public Barco(String nome, int potenciaMotor) {
		super();
		this.nome = nome;
		this.potenciaMotor = potenciaMotor;
	}


	public String getNome() {
		return nome;
	}


	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	
	
	
	
}
