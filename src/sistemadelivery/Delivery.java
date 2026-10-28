
package sistemadelivery;

public class Delivery extends Pedido 
implements ServicoDeEntrega, PoliticaDeDesconto {

    public Delivery(double valorBase, String descricao) {
        super(valorBase, descricao);
    }

    public double calcularFrete() {
        return 10.0;
    }

    public double aplicarDesconto(double valor) {
        return valor * 0.10;
    }

    @Override
    public double calcularPrecoTotal() {
        double frete = calcularFrete();
        double desconto = aplicarDesconto(getValorBase());
        double total = getValorBase() + frete - desconto;

        exibirResumo(frete, desconto, total);

        return total;
    }

}