package Exercicios1a6;

public class Empregado extends Pessoa{
	/*3 - Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
	 * instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
	 * os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
	 * retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores
	 * e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado.*/
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double getcalcularSalario()
	{
		imposto = imposto/100;
		double salario = salarioBase - (salarioBase * imposto);
		return salario;
	}
	public Empregado(String nome, String endereco, String telefone, double salarioBase, double imposto)
	{
		super(nome, endereco, telefone);
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

}
