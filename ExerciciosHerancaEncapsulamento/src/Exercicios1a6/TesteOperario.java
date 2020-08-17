package Exercicios1a6;

public class TesteOperario {
	public static void main(String[] args) 
	{
		//5.1 teste operario
		
		Operario operario1 = new Operario("Eduardo Oliveira", "Rua das Olivas, 56", "+1 555-4126", 3200.75, 30);
		
		System.out.println(operario1.getNome()+"\t"+operario1.getEndereco()+"\t"+operario1.getTelefone());
		System.out.println("Total Produzido: "+operario1.getValorProducao()+"\tComissão(%)"+operario1.getComissao());
		System.out.printf("Salário: %.2f" , operario1.getCalcularSalario());
	}

}
