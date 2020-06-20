package aula20200619;

public class App {

	public static void main(String[] args) {

		Estacionamento estacionamento1 = new Estacionamento();

		Carro gol = new Carro("Gol", "ABC1234", "Preto");
		gol.setMarca("Volkswagen");

		Moto xj6 = new Moto("xj6", "BAH8167", 600);
		xj6.setMarca("Yamaha");

		Barco grandLarge = new Barco("Grand Large", 40);
		grandLarge.setMarca("Grand Large");

		estacionamento1.addveiculos(gol);
		estacionamento1.addveiculos(xj6);
		estacionamento1.addveiculos(grandLarge);

		mostrarTudo(estacionamento1);

	}

	public static void mostrarTudo(Estacionamento e) {
		System.out.println("\n==================MARCAS ESTACIONADAS=================");
		for (int i = 0; i < e.getVeiculos().size(); i++) {
			System.out.println("Marca: " + e.getVeiculos().get(i).getMarca());
		}
	}
}
