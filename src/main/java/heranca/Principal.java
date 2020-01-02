package heranca;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 =  new Funcionario();
		
		
		p2.setNome("Diego Pereira");
		
		System.out.println(p2.toString());
		

	}
}
