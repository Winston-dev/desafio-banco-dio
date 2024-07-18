package br.com.banco.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("---Saldo de Conta Poupança---");
        super.infoSaldo();
    }

    public void imprimirExtrato(){
        System.out.println("Extrato de Conta Poupanca === ");
        super.infoComuns();

    }
}
