package Formativa;

public class PessoaClasse {
	private String nome;
	private int idade;

	public PessoaClasse () {

	}
	public PessoaClasse(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}



}
