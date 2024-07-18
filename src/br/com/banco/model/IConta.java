package br.com.banco.model;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    public void imprimirSaldo();
    public void imprimirExtrato();

}
