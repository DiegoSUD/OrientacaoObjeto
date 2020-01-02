package Teste;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa p[] = new Pessoa[2];
		Livro l[] = new Livro[3];
		
		
		p[0] =  new Pessoa("Diego", 31, 'M');
		p[1] = new Pessoa("Jessica", 24, 'F');
		
		l[0] = new Livro("Java", "Paulo Henrique", 200, p[0]);
		l[1] = new Livro("Aprendendo C#", "Marcos Antunes", 800, p[1]);
		l[2] = new Livro("Java Basico", "Ariano Dantas", 400, p[0]);
		
		
		
		l[0].abrir();
		l[0].folhear(10);
		System.out.println(l[0].detalhes());
		
		
	}
	
	
	
	

}
