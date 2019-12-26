package dia01;

public class Principal {

	public static void main(String[] args) {
	
//		Caneta c1 = new Caneta("ASFS", "VERDE", 0.9f);
//		
//		c1.setModelo("BIC");
//		c1.setPonta(0.6f);
//		c1.status();
		
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(333333);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.depositar(300);
		p1.estadoAtualConta();

	}

}
