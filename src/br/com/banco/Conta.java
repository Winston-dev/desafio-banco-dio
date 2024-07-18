package br.com.banco;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo = 0;


    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }


    public Conta(Cliente cliente){
        this.agencia =Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void infoComuns() {
        System.out.println("Titular: "+ this.cliente.getNomeCliente());
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero da Conta: %d",this.numeroConta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
    protected void infoSaldo(){
        System.out.println("Titular; " + this.cliente.getNomeCliente());
        System.out.println("Saldo: " + this.saldo);
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
