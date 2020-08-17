package Exercicios1a6;

public class Pessoa {
	/*1 - Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
	 *(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
	 *opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
	 *String telefone;*/
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Construtor padrão
	public Pessoa ()
	{
		
	}
	
	//Construtor sem this com 2 parâmetros
	public Pessoa (String Nome, String Endereco)
	{
		nome = Nome;
		endereco = Endereco;
	}
	
	//Construtor com this 3 parâmetros
	public Pessoa (String nome, String endereco, String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

}
