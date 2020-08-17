package Exercicios1a6;

public class Operario extends Pessoa{
	/*Implemente a classe Operario como subclasse da classe Pessoa. Um determinado operário
	 * tem como atributos da classe Pessoa e também os atributos próprios como valorProducao
	 * (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e
	 * comissao (que corresponde à porcentagem do valorProducao que será adicionado ao
	 * vencimento base do operário).*/
	
	private double valorProducao;
	private double comissao;
	private double salario;
	
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
		salario = valorProducao * comissao ;
		return salario;
	}
	public Operario (String nome, String endereco, String telefone, double valorProducao, double comissao)
	{
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

}
