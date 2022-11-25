package aplication;

public class ContaCorrente extends Conta {

    public ContaCorrente(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n #### EXTRATO CORRENTE #####");
        super.imprimirInfosComuns();
    }
    }


