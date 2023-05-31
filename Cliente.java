package lista7;

public class Cliente extends Pessoa {
	private int codigo;

	public Cliente(String nome, String cpf, int codigo) {
		super(nome, cpf);
		this.codigo = codigo;
	}

	@Override
	public String mostraDados() {
		return "{nome:" + nome + ", cpf:" + cpf + ", codigo:" + codigo + "}";
	}
}
