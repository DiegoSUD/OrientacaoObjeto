package polimorfismo;

public class Canguru extends Mamiferos {
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
}
