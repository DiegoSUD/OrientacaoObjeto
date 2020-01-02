package Luta;

import java.util.Random;

public class Figth {
	
	private Lutador desafiado;
	private Lutador desafiantes;
	private int rounds;
	private boolean aprovado;
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiantes() {
		return desafiantes;
	}
	public void setDesafiantes(Lutador desafiantes) {
		this.desafiantes = desafiantes;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiantes = l2;
			System.out.println("A luta foi marcadad!!!");
		}else {
			this.aprovado=false;
			this.desafiado= null;
			this.desafiantes = null;
			System.out.println("Não pode marcar a luta!!");
		}
	}
	
	public void lutar() {
		if (this.aprovado) {
			this.desafiado.apresentar();
			this.desafiantes.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch (vencedor) {
			case 0:
				System.out.println("EMPATOU A LUTA!!!");
				break;
			case 1:
				System.out.println("O vencedoer é : " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiantes.perderLuta();
				break;
			case 2:
				System.out.println("O vencedor é: " + this.desafiantes.getNome());
				this.desafiado.perderLuta();
				this.desafiantes.ganharLuta();
				break;
			default:
				System.out.println("LUTA NÃO PODE ACONTECER!!!");
				break;
			}
		}
	}
	

}
