package SistemaBancario;

public class Deposito extends OperacaoBancaria{
    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Deposito de R$" + getValor() + " realizado");
    }
}
