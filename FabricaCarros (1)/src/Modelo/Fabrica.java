package Modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Visualizacao.Carro;

public class Fabrica {
    
	private ArrayList<Carro> carros;

    public Fabrica() {
        this.carros = new ArrayList<>();
    }

    public void fabricarCarro(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            String modelo = JOptionPane.showInputDialog("Informe o modelo do carro:");
            String cor = JOptionPane.showInputDialog("Informe a cor do carro:");
            Carro carro = new Carro(modelo, cor);
            carros.add(carro);
        }
        JOptionPane.showMessageDialog(null, quantidade + " carro(s) fabricado(s) com sucesso!");
    }

    public void venderCarro() {
        String modelo = JOptionPane.showInputDialog("Informe o modelo do carro a ser vendido:");
        String cor = JOptionPane.showInputDialog("Informe a cor do carro a ser vendido:");

        for (Carro carro : carros) {
            if (carro.getModelo().equalsIgnoreCase(modelo) && carro.getCor().equalsIgnoreCase(cor)) {
                carros.remove(carro);
                JOptionPane.showMessageDialog(null, "Carro vendido com sucesso!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Carro não encontrado na fábrica.");
    }

    public void exibirCarros() {
        StringBuilder infoCarros = new StringBuilder();
        for (Carro carro : carros) {
            infoCarros.append("Modelo: ").append(carro.getModelo()).append(", Cor: ").append(carro.getCor()).append("\n");
        }
        JOptionPane.showMessageDialog(null, infoCarros.toString());
    }
}
