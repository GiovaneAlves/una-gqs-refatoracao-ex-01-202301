package Monitoramento;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.Assert.*;

public class TestPessoa {

    @Test
    public void testColetaNome_NomeVazio() {
        Pessoa pessoa = new Pessoa();
        Mensagem mensagem = new Mensagem();
        String input = "\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        try {
            pessoa.coletaNome(pessoa, scanner, mensagem);
            fail("Deveria ter lançado RuntimeException");
        } catch (RuntimeException e) {
            assertEquals(mensagem.imprimirMensagemErro(), e.getMessage());
        }
    }


    @Test
    public void testColetaNome_Correto() {
        Pessoa pessoa = new Pessoa();
        Mensagem mensagem = new Mensagem();
        String input = "João";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        pessoa.coletaNome(pessoa, scanner, mensagem);
        
        assertEquals("JOÃO", pessoa.getNome());
    }

    @Test
    public void testColetaIdade_Correto() {
        Pessoa pessoa = new Pessoa();
        Mensagem mensagem = new Mensagem();
        String input = "30";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        pessoa.coletaIdade(pessoa, scanner, mensagem);
        
        assertEquals(30, pessoa.getIdade());
    }

    @Test
    public void testColetaIdade_IdadeInvalida() {
        Pessoa pessoa = new Pessoa();
        Mensagem mensagem = new Mensagem();
        String input = "150\n200\n355";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        try {
            pessoa.coletaIdade(pessoa, scanner, mensagem);
            fail("Deveria ter lançado RuntimeException");
        } catch (RuntimeException e) {
            assertEquals(mensagem.imprimirMensagemErro(), e.getMessage());
        }
    }
    
    @Test
    public void testColetaNome_CaracteresEspeciais() {
        Pessoa pessoa = new Pessoa();
        Mensagem mensagem = new Mensagem();
        String input = "@^~";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        try {
            pessoa.coletaNome(pessoa, scanner,mensagem);
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(mensagem.imprimirMensagemErro(), e.getMessage());
        }
    }

    
    @Test
    public void testSetCartaoVacinaEmDia() {
        Pessoa pessoa = new Pessoa();
        String cartaoVacinaEmDiaNao = "NÃO";
        String cartaoVacinaEmDiaSim = "SIM";

        pessoa.setCartaoVacinaEmDia(cartaoVacinaEmDiaNao);
        assertEquals("NAO", pessoa.getCartaoVacinaEmDia());
        assertEquals(cartaoVacinaEmDiaNao, pessoa.getResposta());

        pessoa.setCartaoVacinaEmDia(cartaoVacinaEmDiaSim);
        assertEquals(cartaoVacinaEmDiaSim, pessoa.getCartaoVacinaEmDia());
        assertEquals(cartaoVacinaEmDiaSim, pessoa.getResposta());
    }
    
    @Test
    public void testSetTeveSintomasRecentemente() {
        Pessoa pessoa = new Pessoa();
        String sintomasRecentesSim = "SIM";
        String sintomasRecentesNao = "NÃO";

        pessoa.setTeveSintomasRecentemente(sintomasRecentesSim);
        assertEquals(sintomasRecentesSim, pessoa.getTeveSintomasRecentemente());
        assertEquals(sintomasRecentesSim, pessoa.getResposta());

        pessoa.setTeveSintomasRecentemente(sintomasRecentesNao);
        assertEquals(sintomasRecentesNao, pessoa.getTeveSintomasRecentemente());
        assertEquals(sintomasRecentesNao, pessoa.getResposta());
    }
    
    @Test
    public void testSetTeveContatoComPessoasSintomaticas() {
        Pessoa pessoa = new Pessoa();
        String contatoSim = "SIM";
        String contatoNao = "NÃO";

        pessoa.setTeveContatoComPessoasSintomaticas(contatoSim);
        assertEquals(contatoSim, pessoa.getTeveContatoComPessoasSintomaticas());
        assertEquals(contatoSim, pessoa.getResposta());

        pessoa.setTeveContatoComPessoasSintomaticas(contatoNao);
        assertEquals(contatoNao, pessoa.getTeveContatoComPessoasSintomaticas());
        assertEquals(contatoNao, pessoa.getResposta());
    }
    
    @Test
    public void testSetEstaRetornandoViagem() {
        Pessoa pessoa = new Pessoa();
        String retornandoSim = "SIM";
        String retornandoNao = "NÃO";

        pessoa.setEstaRetornandoViagem(retornandoSim);
        assertEquals(retornandoSim, pessoa.getEstaRetornandoViagem());
        assertEquals(retornandoSim, pessoa.getResposta());

        pessoa.setEstaRetornandoViagem(retornandoNao);
        assertEquals(retornandoNao, pessoa.getEstaRetornandoViagem());
        assertEquals(retornandoNao, pessoa.getResposta());
    }
    
    @Test
    public void testGetIdade() {
        int idade = 30;
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(idade);

        assertEquals(idade, pessoa.getIdade());
    }

    @Test
    public void testSetNome() {
        String nome = "João";
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);

        assertEquals(nome, pessoa.getNome());
    }
    
    @Test
    public void testSetPorcentagemInfeccao() {
        int porcentagemInicial = 50;
        int porcentagemAdicional = 20;
        int porcentagemEsperada = porcentagemInicial + porcentagemAdicional;

        Pessoa pessoa = new Pessoa();
        pessoa.setPorcentagemInfeccao(porcentagemInicial);
        pessoa.setPorcentagemInfeccao(porcentagemAdicional);

        assertEquals(porcentagemEsperada, pessoa.getPorcentagemInfeccao());
    }

    @Test
    public void testSetOrientacaoFinal() {
        String orientacaoEsperada = "Fique em casa e siga as medidas de segurança";

        Pessoa pessoa = new Pessoa();
        pessoa.setOrientacaoFinal(orientacaoEsperada);

        assertEquals(orientacaoEsperada, pessoa.getOrientacaoFinal());
    }

    
    @Test
    public void testConstrutorPessoa() {
        String nome = "João";
        int idade = 30;
        String cartaoVacinaEmDia = "SIM";
        String teveSintomasRecentemente = "NÃO";
        String teveContatoComPessoasSintomaticas = "NÃO";
        String estaRetornandoViagem = "NÃO";
        int porcentagemInfeccao = 0;
        String orientacaoFinal = "Manter as medidas de prevenção";
        String resposta = "Resposta";

        Pessoa pessoa = new Pessoa(nome, idade, cartaoVacinaEmDia, teveSintomasRecentemente,
                teveContatoComPessoasSintomaticas, estaRetornandoViagem, porcentagemInfeccao,
                orientacaoFinal, resposta);

        // Verifica se os atributos foram atribuídos corretamente
        assertEquals(nome, pessoa.getNome());
        assertEquals(idade, pessoa.getIdade());
        assertEquals(cartaoVacinaEmDia, pessoa.getCartaoVacinaEmDia());
        assertEquals(teveSintomasRecentemente, pessoa.getTeveSintomasRecentemente());
        assertEquals(teveContatoComPessoasSintomaticas, pessoa.getTeveContatoComPessoasSintomaticas());
        assertEquals(estaRetornandoViagem, pessoa.getEstaRetornandoViagem());
        assertEquals(porcentagemInfeccao, pessoa.getPorcentagemInfeccao());
        assertEquals(orientacaoFinal, pessoa.getOrientacaoFinal());
        assertEquals(resposta, pessoa.getResposta());
    }
}
