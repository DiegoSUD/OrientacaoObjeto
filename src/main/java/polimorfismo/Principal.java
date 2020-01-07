package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		Mamiferos m = new Mamiferos();
		Reptil r = new Reptil();
		Peixes p = new Peixes();
		Aves a = new Aves();
		
		Canguru canguru = new Canguru();
		
		canguru.locomover();
		
		
		m.setMembros(4);
		m.setIdade(2);
		m.emitirSom();
		
		
	}

}
