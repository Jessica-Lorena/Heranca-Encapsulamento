package Exercicios1a6;

public class TesteTudo {
	public static void main(String[] args) {
		//Testando todas as classes /todos exercícios
		
		Pessoa pessoa1 = new Pessoa(); //apresentação do construtor padrão
		Pessoa pessoa2 = new Pessoa("Flynn Ryder", "Sete oceanos, 2012");//apresentação do construtor sem this com 2 parâmetros
		Pessoa pessoa3 = new Pessoa("Tiana Maddy", "Road Flog, 2009", "+1 407-939-5277");//apresentação do construtor com this com 3 parâmetros
		
		Fornecedor fornecedor1 = new Fornecedor("MercaQualid", "Rua dos Bobos, 0", "45678459", 50000.56, 20000.78);
		
		Empregado empregado1 = new Empregado ("Joe Mout", "Avenida da hora", "+55 43 9837-5687", 4700.56, 14);
		
		Administrador administrador1 = new Administrador("Heitor Rubens", "Rua dos Pássaros, 56", "+55 11 95687-9863", 758.45, 523.71);
		
		Operario operario1 = new Operario("Eduardo Oliveira", "Rua das Olivas, 56", "+1 555-4126", 3200.75, 30);
		
		Vendedor vendedor1 = new Vendedor("Daniela Pinheiro","Avenida dos Pinheiros, 986", "+86 44 9578-4875", 4639.81,30);
		
		System.out.println(pessoa1.getNome()+"\t"+pessoa1.getEndereco()+"\t"+pessoa1.getTelefone());//apresentação do construtor padrão
		System.out.println(pessoa2.getNome()+"\t"+pessoa2.getEndereco()+"\t"+pessoa2.getTelefone());//apresentação do construtor sem this com 2 parâmetros
		System.out.println(pessoa3.getNome()+"\t"+pessoa3.getEndereco()+"\t"+pessoa3.getTelefone());//apresentação do construtor com this com 3 parâmetros
		
		System.out.println("\n"+fornecedor1.getNome()+"\t"+fornecedor1.getEndereco()+"\t"+fornecedor1.getTelefone()+"\tCrédito: "+fornecedor1.getValorCredito()+"\tDívida:"+fornecedor1.getValorDivida());
		System.out.println("Saldo: "+fornecedor1.getobtersaldo());
		
		System.out.println("\n"+empregado1.getNome()+"\t"+empregado1.getEndereco()+"\t"+empregado1.getTelefone());
		System.out.println("Salário Bruto: "+empregado1.getSalarioBase()+"\tImpostos(%): "+empregado1.getImposto());
		System.out.printf("Salário Liquido: %.2f" , empregado1.getcalcularSalario());
		
		System.out.println();
		System.out.println("\n"+administrador1.getNome()+"\t"+administrador1.getEndereco()+"\t"+administrador1.getTelefone());
		System.out.println("Custo Viagens: "+administrador1.getAjudaViagens()+"\tCusto Estádias: "+administrador1.getEstadias());
		System.out.println("Custo Total: "+administrador1.getCalcularAjudaDeCusto()+"\n");
		
		System.out.println(operario1.getNome()+"\t"+operario1.getEndereco()+"\t"+operario1.getTelefone());
		System.out.println("Total Produzido: "+operario1.getValorProducao()+"\tComissão(%)"+operario1.getComissao());
		System.out.printf("Salário: %.2f" , operario1.getCalcularSalario());
		
		System.out.println();
		System.out.println("\n"+vendedor1.getNome()+"\t"+vendedor1.getEndereco()+"\t"+vendedor1.getTelefone());	
		System.out.println("Vendas: "+vendedor1.getValorVendas()+"\tComissão(%):"+vendedor1.getComissao());
		System.out.printf("Salário: %.2f",vendedor1.getCalcularSalario());
	}

}
