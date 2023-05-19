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
  private String resposta;

  public Pessoa () {}
  
  public Pessoa(String nome, int idade, String cartaoVacinaEmDia, String teveSintomasRecentemente,
		String teveContatoComPessoasSintomaticas, String estaRetornandoViagem, int porcentagemInfeccao,
		String orientacaoFinal, String resposta) {
	this.nome = nome;
	this.idade = idade;
	this.cartaoVacinaEmDia = cartaoVacinaEmDia;
	this.teveSintomasRecentemente = teveSintomasRecentemente;
	this.teveContatoComPessoasSintomaticas = teveContatoComPessoasSintomaticas;
	this.estaRetornandoViagem = estaRetornandoViagem;
	this.porcentagemInfeccao = porcentagemInfeccao;
	this.orientacaoFinal = orientacaoFinal;
	this.resposta = resposta;
   }

  public void coletaNome(Pessoa pessoa, Scanner scanner, Mensagem mensagem) {
	    System.out.println("\nInforme o seu nome: ");
	    pessoa.nome = scanner.nextLine();
	    pessoa.nome = pessoa.nome.trim().toUpperCase();

	    if (pessoa.nome.trim().isEmpty()) {
	        System.out.println("O nome não pode ser vazio!");
	    	throw new RuntimeException(mensagem.imprimirMensagemErro());
	    }

	    if (!pessoa.nome.matches("^[\\p{L}\\s]+$")) {
	    	System.out.println("O nome não pode conter números ou caracteres especiais!");
	    	throw new IllegalArgumentException(mensagem.imprimirMensagemErro());
	    }
	}

   

  public void coletaIdade(Pessoa pessoa, Scanner scanner, Mensagem mensagem) {
	  int cont = 0; 
	  
	  do {
		  System.out.println("\nInforme a sua idade: ");
		  pessoa.idade = scanner.nextInt();
		  
	      if (idade>0&&idade<120) {
	          break;
	        } 
	      
	      else {
	          cont++;
	          System.out.println("\nResposta inválida! Digite uma idade de 0 à 120 anos!");
	  	        if (cont == 3) {
	  	          throw new RuntimeException(mensagem.imprimirMensagemErro());
	  	        }
	      }
	      
	      } while (true);
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
		if (cartaoVacinaEmDia.equals("NÃO")) {
			this.cartaoVacinaEmDia = "NAO";
			setResposta(cartaoVacinaEmDia);
		}
		else {
			this.cartaoVacinaEmDia = cartaoVacinaEmDia;
			setResposta(cartaoVacinaEmDia);
		}
	}	
	
	public String getTeveSintomasRecentemente() {
		return teveSintomasRecentemente;
	}
	
	public void setTeveSintomasRecentemente(String teveSintomasRecentemente) {
		setResposta(teveSintomasRecentemente);
		this.teveSintomasRecentemente = teveSintomasRecentemente;
	}
	
	public String getTeveContatoComPessoasSintomaticas() {
		return teveContatoComPessoasSintomaticas;
	}
	
	public void setTeveContatoComPessoasSintomaticas(String teveContatoComPessoasSintomaticas) {
		setResposta(teveContatoComPessoasSintomaticas);
		this.teveContatoComPessoasSintomaticas = teveContatoComPessoasSintomaticas;
	}
	
	public String getEstaRetornandoViagem() {
		return estaRetornandoViagem;
	}
	
	public void setEstaRetornandoViagem(String estaRetornandoViagem) {
		setResposta(estaRetornandoViagem); 
		this.estaRetornandoViagem = estaRetornandoViagem;
	}
	
	public int getPorcentagemInfeccao() {
		return porcentagemInfeccao;
	}
	
	public void setPorcentagemInfeccao(int porcentagemInfeccao) {
		this.porcentagemInfeccao += porcentagemInfeccao;
	}
	
	public String getOrientacaoFinal() {
		return orientacaoFinal;
	}
	
	public void setOrientacaoFinal(String orientacaoFinal) {
		this.orientacaoFinal = orientacaoFinal;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	
}
