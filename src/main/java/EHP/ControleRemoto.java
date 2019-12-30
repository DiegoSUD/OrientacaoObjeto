package EHP;

public class ControleRemoto implements Controlador {

	/**
	 * 
	 */
	private int volume;
	private boolean ligado;
	private boolean tocando;

	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	public boolean isTocando() {
		return tocando;
	}


	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}


	
	// metodos abstratos
	
	public void ligar() {
		this.setLigado(true);
		
	}


	public void desligar() {
		this.setLigado(false);
		
	}


	public void abrirMenu() {
		
		System.out.println("-------------Menu ---------------");
		System.out.println("Está ligado ? " + this.isLigado());
		System.out.println("Está tocando ? " + this.isTocando());
		System.out.print("Volume está : "+ this.getVolume());
			for (int i = 0; i <= this.getVolume(); i+=10) {
				System.out.print("|");
			}
			System.out.println( );
		
	}


	public void fecharVolume() {
		System.out.println("Fechando Menu!!!");
		
	}


	public void maisVolume() {
		if(this.isLigado() == true) {
			this.setVolume(this.getVolume() + 1);
		}
		
	}


	public void menosVolume() {
		if(this.isLigado()== false) {
			this.setVolume(this.getVolume()-1);
		}
		
	}


	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}


	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}


	public void play() {
		if(this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
		
	}


	public void pause() {
		if(this.isLigado() && !(this.isTocando())) {
			this.setTocando(false);
		}
		
	}
	
	
	
	

	
	
	
	
	
}
