package Exercicios1a6;

public class TesteFornecedor{
	public static void main(String[] args) {
		/*2.1 - Depois de implementada a classe Fornecedor, crie um programa de teste
		 * adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
		 * Fornecedor e os herdados da classe Pessoa.*/
		
		Fornecedor fornecedor1 = new Fornecedor("MercaQualid", "Rua dos Bobos, 0", "45678459", 50000.56, 20000.78);
		
		System.out.println(fornecedor1.getNome()+"\t"+fornecedor1.getEndereco()+"\t"+fornecedor1.getTelefone()+"\tCrédito: "+fornecedor1.getValorCredito()+"\tDívida:"+fornecedor1.getValorDivida());
		System.out.println("Saldo: "+fornecedor1.getobtersaldo());
	}

}
