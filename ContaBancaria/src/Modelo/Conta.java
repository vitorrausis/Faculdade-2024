package Modelo;

import javax.swing.JOptionPane;

public class Conta {
    private String titularDaConta;
    private int tipo;
    private double saldo;
    private Movimentacao movimentacao;

    public Conta(String titularDaConta, int tipo) {
        this.titularDaConta = titularDaConta;
        this.tipo = tipo;
        this.saldo = 0;
        this.movimentacao = new Movimentacao();
    }

    public void depositar(double valor) {
        this.saldo += valor;
        movimentacao.registrarDeposito(valor);
    }

    public void sacar(double valor) {
        if (this.saldo - valor < -1000) {
            JOptionPane.showMessageDialog(null, "Saque não permitido! Saldo não pode ficar negativo em mais de R$ 1000.");
            return;
        }
        this.saldo -= valor;
        movimentacao.registrarSaque(valor);
    }

    public double gerarSaldo() {
        return this.saldo;
    }

    public String gerarDadosDaConta() {
        return "Titular: " + this.titularDaConta + "\nTipo de conta: " + (this.tipo == 1 ? "Conta Poupança" : "Conta Corrente") + "\nSaldo: R$" + this.saldo;
    }

    public String gerarExtrato() {
        return movimentacao.gerarExtrato();
    }

    public String gerarExtratoDepositos() {
        return movimentacao.gerarExtratoDepositos();
    }

    public String gerarExtratoSaques() {
        return movimentacao.gerarExtratoSaques();
    }
}