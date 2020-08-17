package Exercicios1a6;

public class TesteAdministrador {
	public static void main(String[] args) 
	{
		//4.1 teste administrador
		
		Administrador administrador1 = new Administrador("Heitor Rubens", "Rua dos Pássaros, 56", "+55 11 95687-9863", 758.45, 523.71);
		
		System.out.println(administrador1.getNome()+"\t"+administrador1.getEndereco()+"\t"+administrador1.getTelefone());
		System.out.println("Custo Viagens: "+administrador1.getAjudaViagens()+"\tCusto Estádias: "+administrador1.getEstadias());
		System.out.println("Custo Total: "+administrador1.getCalcularAjudaDeCusto());
	}

}
