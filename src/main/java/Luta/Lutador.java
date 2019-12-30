package Luta;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso; 
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	
	public void apresentar() {
		System.out.println("--------------------- AGORA --------------------------");
		System.out.println("Apresentamos o lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println(getIdade() + " idade");
		System.out.println(getAltura() + " altura");
		System.out.println("Pesando: " + getPeso());
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
	}
	
	public void status() {
		System.out.println(getNome());
		System.out.println("Pesando: " + getPeso() + " é um peso "+ getCategoria());
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
		
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setVitorias(this.getVitorias() - 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso,
			int vitorias, int derrotas, int empates) {

		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.getPeso() < 52.2) {
			this.categoria = "Inválida";
		}else if(this.getPeso() <= 70.3) {
			this.categoria = "Peso Leve";
		}else if(this.getPeso() <= 83.9) {
			this.categoria = "Medio";
		}else if(this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		}else {
			categoria = "Inválido";
		}
		
		
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
	
}
