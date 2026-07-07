package SistemaDePagamentos;

public class CartaoCredito extends Pagamento{

    public CartaoCredito(double valor) {
        super(valor);
    }

    public double calcularTaxa(){
        return getValor() * 0.03;
    }

    public void confirmarPagamento(){
        System.out.println("Pagamento de R$" + getValor() + " confirmado no Cartao de Credito (Taxa: R$" + calcularTaxa() + ")");
    }
}
