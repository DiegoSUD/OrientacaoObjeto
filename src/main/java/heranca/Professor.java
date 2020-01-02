package heranca;

public class Professor extends Pessoa {
	

	private String especialidadde;
	private double salario;
	
	public String getEspecialidadde() {
		return especialidadde;
	}

	public void setEspecialidadde(String especialidadde) {
		this.especialidadde = especialidadde;
	}

	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public void receberAumento(double  aum) {
		this.setSalario(this.getSalario() + aum);
	} 

}
