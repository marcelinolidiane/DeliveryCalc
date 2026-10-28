
package sistemadelivery;

public class PedidoRetirada extends Pedido 
implements PoliticaDeDesconto {

    public PedidoRetirada(double valorBase, String descricao) {
        super(valorBase, descricao);
    }

    public double aplicarDesconto(double valor) {
        return valor * 0.15;
    }

    @Override
    public double calcularPrecoTotal() {
        double frete = 0;
        double desconto = aplicarDesconto(getValorBase());
        double total = getValorBase() - desconto;

        exibirResumo(frete, desconto, total);

        return total;
    }

}