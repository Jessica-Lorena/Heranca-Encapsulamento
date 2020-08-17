package Exercicios1a6;

public class Vendedor extends Pessoa{
	/*Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
	 * tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
	 * (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
	 * do valorVendas que será adicionado ao vencimento base do Vendedor).*/
	
	private double valorVendas;
	private double comissao;
	private double salario;
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getCalcularSalario()
	{
		comissao = (comissao / 100) +1;
		salario = valorVendas * comissao ;
		return salario;
	}
	public Vendedor (String nome, String endereco, String telefone, double valorVendas, double comissao)
	{
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

}
