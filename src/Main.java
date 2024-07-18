//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNomeCliente("Winston");

        Cliente cliente2 = new Cliente();
        cliente2.setNomeCliente("Leticia");


        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);




        cc.depositar(150);
        poupanca.depositar(350);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.transferir(50,poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.imprimirSaldo();






    }

}