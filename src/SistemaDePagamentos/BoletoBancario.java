package SistemaDePagamentos;

public class BoletoBancario extends Pagamento{

    public BoletoBancario(double valor) {
        super(valor);
    }

    public double calcularTaxa(){
        return getValor() * 0.01;
    }

    public void confirmarPagamento(){
        System.out.println("Boleto de R$" + getValor() + " gerado com sucesso (Taxa: R$" + calcularTaxa() + ")");
    }
}
