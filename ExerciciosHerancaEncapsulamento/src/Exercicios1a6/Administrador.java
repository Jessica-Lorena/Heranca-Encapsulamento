package Exercicios1a6;

public class Administrador extends Pessoa{
	/*Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
	 * administrador tem como atributos da classe Pessoa e também os atributos próprios como
	 * ajudaDeCusto (ajudas referentes a viagens, estadias).*/
	
	private double ajudaViagens;
	private double estadias;
	private double ajudaDeCusto;
	
	public double getAjudaViagens() {
		return ajudaViagens;
	}
	public void setAjudaViagens(double ajudaViagens) {
		this.ajudaViagens = ajudaViagens;
	}
	public double getEstadias() {
		return estadias;
	}
	public void setEstadias(double estadias) {
		this.estadias = estadias;
	}
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double getCalcularAjudaDeCusto()
	{
		ajudaDeCusto = ajudaViagens + estadias;
		return ajudaDeCusto;
	}
	public Administrador(String nome, String endereco, String telefone, double ajudaViagens, double estadias)
	{
		super(nome, endereco, telefone);
		this.ajudaViagens = ajudaViagens;
		this.estadias = estadias;
	}

}
