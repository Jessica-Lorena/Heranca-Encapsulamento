package Exercicios1a6;

public class TesteEmpregado {
	public static void main(String[] args) 
	{
		//3.1 - Escreva um programa de teste adequado para a classe Empregado.
		
		Empregado empregado1 = new Empregado ("Joe Mout", "Avenida da hora", "+55 43 9837-5687", 4700.56, 14);
		
		System.out.println(empregado1.getNome()+"\t"+empregado1.getEndereco()+"\t"+empregado1.getTelefone());
		System.out.println("Salário Bruto: "+empregado1.getSalarioBase()+"\tImpostos(%): "+empregado1.getImposto());
		System.out.printf("Salário Liquido: %.2f" , empregado1.getcalcularSalario());
	}

}
