package SistemaDePagamentos;

public class Pix extends Pagamento{

    public Pix(double valor) {
        super(valor);
    }

    public void confirmarPagamento(){
        System.out.println("Pagamento via Pix de R$" + getValor() + " confirmado");
    }
}

