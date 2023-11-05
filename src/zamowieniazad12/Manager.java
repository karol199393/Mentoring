package zamowieniazad12;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<Order, Integer> ordersMap = new HashMap<>();

    public void addOrder(Order order) {
        if (ordersMap.containsKey(order)) {
            int currentQuantity = ordersMap.get(order);
            ordersMap.put(order, currentQuantity + 1);
        } else {
            ordersMap.put(order, 1);
        }
    }

    public void removeOrder(Order order) {
        if (ordersMap.containsKey(order)) {
            int currentQuantity = ordersMap.get(order);
            if (currentQuantity > 1) {
                ordersMap.put(order, currentQuantity - 1);
            } else {
                ordersMap.remove(order);
            }
        }
    }

    public void displayOrders() {
        for (Map.Entry<Order, Integer> entry : ordersMap.entrySet()) {
            Order order = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("ID: " + order.getId() + ", Name: " + order.getName() + ", Price: " + order.getPrice() + ", Quantity: " + quantity);
        }
    }
}

