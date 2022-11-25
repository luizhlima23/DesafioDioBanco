package aplication;

public class Main {

    public static void main(String[]args){
        Clientes luiz =new Clientes();
        Clientes joao = new Clientes();
        joao.setNome("Joao");
        luiz.setNome("Luiz");


        Conta cc1 = new ContaCorrente(luiz);
        cc1.depositar(1000);
        Conta cp2 = new ContaPoupanca(joao);
        cc1.transferir(100,cp2);

        cc1.imprimirExtrato();
        cp2.imprimirExtrato();

        System.out.println();

    }
}
