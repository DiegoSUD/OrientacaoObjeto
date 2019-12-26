package dia01;

public class ContaBanco {

	private int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else {
			this.setSaldo(150);
		}
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("A conta tem dinheiro, não pode ser fechada");
		} else if (this.getSaldo() < 0) {
			System.out.println("A conta está em debito");
		} else {
			this.setStatus(false);
		}
	}

	public void depositar(double valor) {
		if (this.isStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
		} else {
			System.out.println("Impossivel depositar a conta esta fechada");
		}
	}

	public void sacar(double saque) {
		if (this.isStatus() == true) {
			if (this.getSaldo() >= saque) {
				this.setSaldo(this.getSaldo() - saque);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("A conta está fechada");
		}
	}

	public void pagarMensalidade() {
		double mens;

		if (this.getTipo() == "CC" && this.isStatus() == true) {
			mens = 12;
			if (this.getSaldo() > mens) {
				this.setSaldo(getSaldo() - mens);
			} else {
				System.out.println("A conta possui saldo insuficiente para retirar a mensalidade");
			}
		} else if (this.getTipo() == "CP" && this.isStatus() == true) {
			mens = 20;
			if (this.getSaldo() > mens) {
				this.setSaldo(getSaldo() - mens);
			} else {
				System.out.println("A conta possui saldo insuficiente para retirar a mensalidade");
			}
		}
	}
	
	
	public void estadoAtualConta() {
		System.out.println("-----------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
		
		
	}
}
