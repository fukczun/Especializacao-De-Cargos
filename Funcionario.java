package lista7;

public class Funcionario extends Pessoa {
	protected String matricula;
	protected double salario;
	
	public Funcionario(String nome, String cpf, String matricula, double salario) {
		super(nome, cpf);
		this.matricula = matricula;
		this.salario = salario;
	}

	public String mostraDados(String moeda) {
		return "{nome:" + nome + ", cpf:" + cpf + ", matricula:" + matricula + ", salario:" + moeda + salario + "}";
	}
	
	@Override
	public String mostraDados() {
		return "{nome:" + nome + ", cpf:" + cpf + ", matricula:" + matricula + ", salario:" + salario + "}";
	}
}
