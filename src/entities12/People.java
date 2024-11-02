package entities12;

public class People {

	private String nome;
	private double nota01;
	private double nota02;

	public People() {

	}

	public People(String nome, double nota01, double nota02) {
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota01() {
		return nota01;
	}

	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}

	public double getNota02() {
		return nota02;
	}

	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}

}