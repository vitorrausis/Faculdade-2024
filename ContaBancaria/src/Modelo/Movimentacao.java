package Modelo;

public class Movimentacao {
    private StringBuilder extrato;

    public Movimentacao() {
        this.extrato = new StringBuilder();
    }

    public void registrarDeposito(double valor) {
        extrato.append("Depósito: +R$").append(valor).append("\n");
    }

    public void registrarSaque(double valor) {
        extrato.append("Saque: -R$").append(valor).append("\n");
    }

    public String gerarExtrato() {
        return "Extrato da conta:\n" + extrato.toString();
    }

    public String gerarExtratoDepositos() {
        return "Extrato de Depósitos:\n" + extrato.toString();
    }

    public String gerarExtratoSaques() {
        return "Extrato de Saques:\n" + extrato.toString();
    }
}
