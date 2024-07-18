package br.com.banco;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {

        System.out.println("---Saldo de Conta Corrente---");
        super.infoSaldo();

    }

    public void imprimirExtrato(){
        System.out.println("Extrato de Conta Corrente === ");
        super.infoComuns();

    }

}
