package Principal;

import Controle.Controladora;
import Modelo.Conta;

public class Principal {
    public static void main(String[] args) {
        Controladora controladora = new Controladora(new Conta("Vitor", 2));
        controladora.iniciar();
    }
}