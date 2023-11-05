package zamowieniazad12;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "Product A", 10.0);
        Order order2 = new Order(2, "Product B", 20.0);

        Manager manager = new Manager();
        manager.addOrder(order1);
        manager.addOrder(order1); // Add one more order of the same type
        manager.addOrder(order2);

        manager.displayOrders();

        manager.removeOrder(order1);
        manager.displayOrders();
    }
}

