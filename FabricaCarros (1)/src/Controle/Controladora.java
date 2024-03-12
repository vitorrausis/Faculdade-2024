package Controle;

import javax.swing.JOptionPane;

import Modelo.Fabrica;

public class Controladora {
    private Fabrica fabrica;

    public Controladora() {
        this.fabrica = new Fabrica();
    }

    public void exibirMenu() {
        while (true) {
            String[] opcoes = {"Fabricar carros", "Vender um carro", "Ver informações dos carros", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:\n", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros deseja fabricar?"));
                    fabrica.fabricarCarro(quantidade);
                    break;
                case 1:
                    fabrica.venderCarro();
                    break;
                case 2:
                    fabrica.exibirCarros();
                    break;
                case 3:
                    return;
            }
        }
    }
}
