package sistemadelivery;
public abstract class Pedido implements CalculadoraDePreco {

    private double valorBase;
    private String descricao;

    public Pedido(double valorBase, String descricao) {
        this.valorBase = valorBase;
        this.descricao = descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirResumo(double frete, double desconto, double total) {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor base: " + valorBase);
        System.out.println("Frete: " + frete);
        System.out.println("Desconto: " + desconto);
        System.out.println("Total: " + total);
    }

}