package Controle;

import javax.swing.JOptionPane;
import Modelo.*;
import Visualizacao.EntradaSaida;

public class Controladora {
   
	private Conta conta;
    private EntradaSaida entradaSaida;

    public Controladora(Conta conta) {
        this.conta = conta;
        this.entradaSaida = new EntradaSaida();
    }

    public void iniciar() {
        while (true) {
            int escolha = entradaSaida.exibirMenu();
            switch (escolha) {
                case 1:
                    solicitarInformacoesDeposito();
                    break;
                case 2:
                    solicitarInformacoesSaque();
                    break;
                case 3:
                    entradaSaida.exibirSaldo(conta.gerarSaldo());
                    break;
                case 4:
                    entradaSaida.exibirDadosDaConta(conta.gerarDadosDaConta());
                    break;
                case 5:
                    entradaSaida.exibirExtratoCompleto(conta.gerarExtrato());
                    break;
                case 6:
                    entradaSaida.exibirExtratoDeDepositos(conta.gerarExtratoDepositos());
                    break;
                case 7:
                    entradaSaida.exibirExtratoDeSaques(conta.gerarExtratoSaques());
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private void solicitarInformacoesDeposito() {
        double valor = entradaSaida.solicitarInformacoesDeposito();
        conta.depositar(valor);
    }

    private void solicitarInformacoesSaque() {
        double valor = entradaSaida.solicitarInformacoesSaque();
        conta.sacar(valor);
    }
}