package Monitoramento;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

public class TestMensagem {
    private Mensagem mensagem;
    private Pessoa pessoa;
    private Scanner scanner;

    @Before
    public void setup() {
        mensagem = new Mensagem();
        pessoa = new Pessoa();
        scanner = new Scanner(System.in);
    }

    @Test
    public void testRealizaPerguntaVacinaEmDia() {
        pessoa.setCartaoVacinaEmDia("SIM");
        boolean resultado = mensagem.realizaPerguntaVacinaEmDia(pessoa, scanner);
        Assert.assertFalse(resultado);

        pessoa.setCartaoVacinaEmDia("NAO");
        resultado = mensagem.realizaPerguntaVacinaEmDia(pessoa, scanner);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testRealizaPerguntaTeveSintomasRecenmente() {
        pessoa.setTeveSintomasRecentemente("SIM");
        boolean resultado = mensagem.realizaPerguntaTeveSintomasRecenmente(pessoa, scanner);
        Assert.assertFalse(resultado);

        pessoa.setTeveSintomasRecentemente("NAO");
        resultado = mensagem.realizaPerguntaTeveSintomasRecenmente(pessoa, scanner);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testRealizaPerguntaTeveContatoPessoasAssintomaticas() {
        pessoa.setTeveContatoComPessoasSintomaticas("SIM");
        boolean resultado = mensagem.realizaPerguntaTeveContatoPessoasAssintomaticas(pessoa, scanner);
        Assert.assertFalse(resultado);

        pessoa.setTeveContatoComPessoasSintomaticas("NAO");
        resultado = mensagem.realizaPerguntaTeveContatoPessoasAssintomaticas(pessoa, scanner);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testRealizaPerguntaEstaRetornandoViagemExterior() {
        pessoa.setEstaRetornandoViagem("SIM");
        boolean resultado = mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa, scanner);
        Assert.assertFalse(resultado);

        pessoa.setEstaRetornandoViagem("NAO");
        resultado = mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa, scanner);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testImprimirMensagemErro() {
        String resultado = mensagem.imprimirMensagemErro();
        Assert.assertNotNull(resultado);
        Assert.assertNotEquals("", resultado);
    }

    // Adicione outros testes conforme necessário para cobrir todos os cenários
}
