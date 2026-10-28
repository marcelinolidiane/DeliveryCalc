package sistemadelivery;
public class SistemaDelivery {
    public static void main(String[] args) {
        Pedido p1 = new Delivery(60, "Pizza");
        Pedido p2 = new Delivery(14, "Coca-Cola Zero");
        Pedido p3 = new PedidoRetirada(30, "Hamburguer");
        Pedido p4 = new PedidoRetirada(10, "Guaraná Antártica");

        System.out.println("=== Pedido Delivery ===");
        p1.calcularPrecoTotal();

        System.out.println("\n=== Pedido Delivery ===");
        p2.calcularPrecoTotal();
        
        System.out.println("\n=== Pedido Retirado ===");
        p3.calcularPrecoTotal();
        
        System.out.println("\n=== Pedido Retirado ===");
        p4.calcularPrecoTotal();

    } 
}
