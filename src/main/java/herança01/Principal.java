package herança01;

public class Principal {

	public static void main(String[] args) {
		
		
//		Pessoa p = new Pessoa();
//		Visitante v = new Visitante();
//		v.setNome("Jovenal");
//		System.out.println(v.toString());
		
	
		Aluno al = new Aluno();
		
		al.setNome("Diego");
		al.setMatricula(112233);
		al.pagarMensalidade();
		System.out.println(al.toString());
		
		
		Bolsista b = new Bolsista();
		b.setNome("Jessica");
		b.pagarMensalidade();
		
		

	}

}
