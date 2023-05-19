package Monitoramento;

public class CalculoPorcentagem {
  public void calculaPorcentagem(Pessoa pessoa) {
    
	  if (pessoa.getEstaRetornandoViagem().equals("SIM")) {
      pessoa.setPorcentagemInfeccao(30);
	  }

	  if (pessoa.getCartaoVacinaEmDia().equals("NAO")) {
      pessoa.setPorcentagemInfeccao (10);
	  }

	  if (pessoa.getTeveSintomasRecentemente().equals("SIM")) {
      pessoa.setPorcentagemInfeccao (30);
	  }

	  if (pessoa.getTeveContatoComPessoasSintomaticas().equals("SIM")) {
      pessoa.setPorcentagemInfeccao (30);
	  }
  }
}
