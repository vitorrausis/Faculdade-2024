package Visualizacao;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public int exibirMenu() {
        String escolhaStr = JOptionPane.showInputDialog("Escolha uma opção:\n1. Depositar\n2. Sacar\n3. Exibir Saldo\n4. Exibir Dados da Conta\n5. Exibir Extrato Completo\n6. Exibir Extrato de Depósitos\n7. Exibir Extrato de Saques\n8. Sair");
        return Integer.parseInt(escolhaStr);
    }

    public double solicitarInformacoesDeposito() {
        String valorStr = JOptionPane.showInputDialog("Digite o valor do depósito:");
        return Double.parseDouble(valorStr);
    }

    public double solicitarInformacoesSaque() {
        String valorStr = JOptionPane.showInputDialog("Digite o valor do saque:");
        return Double.parseDouble(valorStr);
    }

    public void exibirSaldo(double saldo) {
        JOptionPane.showMessageDialog(null, "Saldo atual: R$" + saldo);
    }

    public void exibirDadosDaConta(String dados) {
        JOptionPane.showMessageDialog(null, dados);
    }

    public void exibirExtratoCompleto(String extrato) {
        JOptionPane.showMessageDialog(null, extrato);
    }

    public void exibirExtratoDeDepositos(String extrato) {
        JOptionPane.showMessageDialog(null, extrato);
    }

    public void exibirExtratoDeSaques(String extrato) {
        JOptionPane.showMessageDialog(null, extrato);
    }
}