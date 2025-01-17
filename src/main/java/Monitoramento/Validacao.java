package Monitoramento;
import java.util.Scanner;

public class Validacao {
  public void calcularValidacaoFinal(Pessoa pessoa, Mensagem mensagem, boolean erroTentativas) {
    // Valido se imprimo a mensagem de erro
    if (erroTentativas) {
       System.out.println(mensagem.imprimirMensagemErro());
    } 
    else {
      CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
      calculoPorcentagem.calculaPorcentagem(pessoa);

      // Verifico se a pessoa está retornando de viagem
      if (pessoa.getEstaRetornandoViagem().equals("SIM")&& pessoa.getPorcentagemInfeccao() <= 89) {
        pessoa.setOrientacaoFinal("Você ficará sob observação por 05 dias.");  
      } 
      else {
    	  
        // Verifico a porcentagem de infecção
        if (pessoa.getPorcentagemInfeccao() <= 30) {
          pessoa.setOrientacaoFinal ("Paciente sob observação. Caso apareça algum sintoma, "
          		+ "gentileza buscar assistência médica.");
        } 
        
        else if (pessoa.getPorcentagemInfeccao() <= 60) {
            pessoa.setOrientacaoFinal ("Paciente com risco de estar infectado. "
            		+ "Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
        } 
        else if (pessoa.getPorcentagemInfeccao() <= 89) {
            pessoa.setOrientacaoFinal ("Paciente com alto risco de estar infectado. "
            		+ "Gentileza aguardar em lockdown por 05 dias para ser acompanhado.");
        } 
        else {
          pessoa.setOrientacaoFinal ("Paciente crítico! "
          		+ "Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
        }
      }
      	mensagem.imprimirRelatorioFinal(pessoa);
    }
  }

  public boolean validacaoDasPerguntas(Mensagem mensagem, Pessoa pessoa, boolean erroTentativas, Scanner scanner) {
	  
	  if (!erroTentativas)
		erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa, scanner);
	  
	  if (!erroTentativas)
	    erroTentativas = mensagem.realizaPerguntaTeveSintomasRecenmente(pessoa, scanner);

	  if (!erroTentativas)
	    erroTentativas = mensagem.realizaPerguntaTeveContatoPessoasAssintomaticas(pessoa, scanner);

	  if (!erroTentativas)
	    erroTentativas = mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa, scanner);

	  return erroTentativas;
	}

}
