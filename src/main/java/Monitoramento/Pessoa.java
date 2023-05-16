package Monitoramento;

import java.util.Scanner;

public class Pessoa {
  private String nome;
  private int idade;
  private String cartaoVacinaEmDia;
  private String teveSintomasRecentemente;
  private String teveContatoComPessoasSintomaticas;
  private String estaRetornandoViagem;
  private int porcentagemInfeccao;
  private String orientacaoFinal;

  public Pessoa () {}
  
  public Pessoa(String nome, int idade, String cartaoVacinaEmDia, String teveSintomasRecentemente,
		String teveContatoComPessoasSintomaticas, String estaRetornandoViagem, int porcentagemInfeccao,
		String orientacaoFinal) {
	this.nome = nome;
	this.idade = idade;
	this.cartaoVacinaEmDia = cartaoVacinaEmDia;
	this.teveSintomasRecentemente = teveSintomasRecentemente;
	this.teveContatoComPessoasSintomaticas = teveContatoComPessoasSintomaticas;
	this.estaRetornandoViagem = estaRetornandoViagem;
	this.porcentagemInfeccao = porcentagemInfeccao;
	this.orientacaoFinal = orientacaoFinal;
   }

   public void coletaNome(Pessoa pessoa, Scanner scanner) {
   System.out.println("\nInforme o seu nome: ");
   pessoa.nome = scanner.nextLine();
   pessoa.nome = nome.trim().toUpperCase();
   }
   
  public void coletaIdade(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nInforme a sua idade: ");
    pessoa.idade = scanner.nextInt();
  }

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCartaoVacinaEmDia() {
		return cartaoVacinaEmDia;
	}
	
	public void setCartaoVacinaEmDia(String cartaoVacinaEmDia) {
		this.cartaoVacinaEmDia = cartaoVacinaEmDia;
	}
	
	public String getTeveSintomasRecentemente() {
		return teveSintomasRecentemente;
	}
	
	public void setTeveSintomasRecentemente(String teveSintomasRecentemente) {
		this.teveSintomasRecentemente = teveSintomasRecentemente;
	}
	
	public String getTeveContatoComPessoasSintomaticas() {
		return teveContatoComPessoasSintomaticas;
	}
	
	public void setTeveContatoComPessoasSintomaticas(String teveContatoComPessoasSintomaticas) {
		this.teveContatoComPessoasSintomaticas = teveContatoComPessoasSintomaticas;
	}
	
	public String getEstaRetornandoViagem() {
		return estaRetornandoViagem;
	}
	
	public void setEstaRetornandoViagem(String estaRetornandoViagem) {
		this.estaRetornandoViagem = estaRetornandoViagem;
	}
	
	public int getPorcentagemInfeccao() {
		return porcentagemInfeccao;
	}
	
	public void setPorcentagemInfeccao(int porcentagemInfeccao) {
		this.porcentagemInfeccao = porcentagemInfeccao;
	}
	
	public String getOrientacaoFinal() {
		return orientacaoFinal;
	}
	
	public void setOrientacaoFinal(String orientacaoFinal) {
		this.orientacaoFinal = orientacaoFinal;
	}
  
}
