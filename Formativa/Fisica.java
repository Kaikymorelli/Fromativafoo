package Formativa;

public class Fisica extends Pessoa {
	private String cpf;
	private String rg;

	public Fisica () {

	}

	public Fisica(String cpf, String rg, String nome) {
		super(nome);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}



}
