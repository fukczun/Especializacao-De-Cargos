package lista7;

public class Gerente extends Funcionario {
	private int area;

	public Gerente(String nome, String cpf, String matricula, double salario, int area) {
		super(nome, cpf, matricula, salario);
		this.area = area;
	}
	
	public String mostraDados(String moeda) {
		return "{nome:" + nome + ", cpf:" + cpf + ", matricula:" + matricula + ", salario:" + moeda + salario  + ", area:" + area + "}";
	}
	
	@Override
	public String mostraDados() {
		return "{nome:" + nome + ", cpf:" + cpf + ", matricula:" + matricula + ", salario:" + salario  + ", area:" + area + "}";
	}
}
