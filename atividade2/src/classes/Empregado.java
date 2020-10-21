package classes;

public class Empregado extends Pessoa {
	protected double salario;
	
	public Empregado(String p_nome, String p_endereco, String p_telefone, double e_salario) {
		super(p_nome, p_endereco, p_telefone);
		salario = e_salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
