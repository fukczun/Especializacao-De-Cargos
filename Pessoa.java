package lista7;

public class Pessoa {
	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String mostraDados() {
		return "{nome:" + nome + ", cpf:" + cpf + "}";
	}
}
