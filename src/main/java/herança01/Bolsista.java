package heran�a01;

public class Bolsista extends Aluno {
	
	private int  bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa do " +  this.getNome());
	}
	
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " � bolsista! Pagamento facilitado!!");
	}

}
