package Monitoramento;

import java.util.Scanner;

public class Mensagem {
	
  public boolean realizaPerguntaVacinaEmDia(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out.println("\nSeu cartão de vacina está em dia? Digite SIM ou NAO ?");
      
      pessoa.setCartaoVacinaEmDia (scanner.next().toUpperCase());
      	

      	if (tratamentoResposta(pessoa)) {
        break;
      	} 
      	
      	else {
        contador++;
        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
        
        	if (contador == 3) {
        		erroTentativas = true;
        		break;
        	}
      	}
    } while (true);

    return erroTentativas;
  }

  public boolean realizaPerguntaTeveSintomasRecenmente(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out.println("\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular"
      		+ ", gripe) Digite SIM ou NAO");
      
      pessoa.setTeveSintomasRecentemente (scanner.next().toUpperCase());
      
      	if (tratamentoResposta(pessoa)) {
      		break;
      	} 
      	else {
            contador++;
            System.out.println("\nDigito inválido! Digite SIM ou NAO.");
            
            	if (contador == 3) {
            		erroTentativas = true;
            		break;
            	}
          	}
        } while (true);

        return erroTentativas;
      }

  public boolean realizaPerguntaTeveContatoPessoasAssintomaticas(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out.println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?" +
              " Digite SIM ou NAO");
      
      pessoa.setTeveContatoComPessoasSintomaticas(scanner.next().toUpperCase());
      
      if (tratamentoResposta(pessoa)) {
        break;
      } 
      else {
        contador++;
        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
        	if (contador == 3) {
        		erroTentativas = true;
        		break;
        	}
      }
    } while (true);

    return erroTentativas;
  }

  public boolean realizaPerguntaEstaRetornandoViagemExterior(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out.println("\nEstá retornando de viagem do exterior? "
      		+ "Digite SIM ou NAO");
      
      pessoa.setEstaRetornandoViagem(scanner.next().toUpperCase());
      
      if (tratamentoResposta(pessoa)) {
        break;
      } 
      else {
        contador++;
        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
	        if (contador == 3) {
	          erroTentativas = true;
	          break;
	        }
      }
    } while (true);

    return erroTentativas;
  }

  public void imprimirRelatorioFinal(Pessoa pessoa) {
    System.out.println("\nNome: " + pessoa.getNome());
    System.out.println("Idade: " + pessoa.getIdade() + " anos");
    System.out.println("Cartão Vacina em Dia: " + pessoa.getCartaoVacinaEmDia());
    System.out.println("Teve sintomas recentemente: " + pessoa.getTeveSintomasRecentemente());
    System.out.println("Teve contato com pessoas infectadas: " + pessoa.getTeveContatoComPessoasSintomaticas());
    System.out.println("Esta retornando de viagem: " + pessoa.getEstaRetornandoViagem());
    System.out.println("Porcentagem infecção: " + pessoa.getPorcentagemInfeccao());
    System.out.println("Orientação Final: " + pessoa.getOrientacaoFinal());
  }

  public void imprimirMensagemErro() {
    System.out.println("Não foi possível realizar a verificação." +
        "Gentileza informar dados válidos.");
  }
  
  public boolean tratamentoResposta (Pessoa pessoa){
  	  
  	  if (pessoa.getResposta().equals("SIM"))
  		return true;	  
  	  else if (pessoa.getResposta().equals("NAO"))
  		return true;
  	  else if (pessoa.getResposta().equals("NÃO"))
  		return true;
  	  
  	  return false;
  }
	
}