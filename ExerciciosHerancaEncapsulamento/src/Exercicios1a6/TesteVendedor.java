package Exercicios1a6;

public class TesteVendedor {
	public static void main(String[] args) 
	{
		//6.1 teste vendedor
		
		Vendedor vendedor1 = new Vendedor("Daniela Pinheiro","Avenida dos Pinheiros, 986", "+86 44 9578-4875", 4639.81,30);
		
		System.out.println(vendedor1.getNome()+"\t"+vendedor1.getEndereco()+"\t"+vendedor1.getTelefone());	
		System.out.println("Vendas: "+vendedor1.getValorVendas()+"\tComissão(%):"+vendedor1.getComissao());
		System.out.printf("Salário: %.2f",vendedor1.getCalcularSalario());
	}

}
