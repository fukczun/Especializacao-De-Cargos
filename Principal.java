package lista7;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("João", "123-456");
		Cliente c = new Cliente("Maria", "789-012", 111);
		Funcionario f = new Funcionario("Júnior", "345-678", "987", 1000);
		Gerente g =  new Gerente("Felipa", "901-234", "654", 5000, 22);
		
		System.out.println(p.mostraDados());
		System.out.println(c.mostraDados());
		System.out.println(f.mostraDados());
		System.out.println(f.mostraDados("R$"));
		System.out.println(g.mostraDados());
		System.out.println(g.mostraDados("US$"));
	}
	
}
