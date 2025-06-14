import java.util.ArrayList;

public class Order {
    private ArrayList<item> shoppingCart;
    private ArrayList<Integer> quantities;
    private String date;
   

    public Order() {
        shoppingCart = new ArrayList<>();
        quantities = new ArrayList<>();
        this.date = "2025-01-01";
    }

    public void addToCart(item i, int qty) {
        shoppingCart.add(i);
        quantities.add(qty);
    }
    public void setDate(String date) {
        this.date = date;
    }



    public String getDate() {
        return this.date;
    }
    public void displayCart() {
        System.out.println("\n----- Your Order -----");
        for (int i = 0; i < shoppingCart.size(); i++) {
            item it = shoppingCart.get(i);
            int qty = quantities.get(i);
            it.display();
            System.out.println("Quantity ordered: " + qty);
            System.out.println("Total price: " + (qty * it.getprice()));
            System.out.println("----------------------");
        }
    }
    public item getItem(int index) {
    return shoppingCart.get(index);
}

public int getQuantity(int index) {
    return quantities.get(index);
}

public void updateQuantity(int index, int newQty) {
    quantities.set(index, newQty);
}

public void removeItem(int index) {
    shoppingCart.remove(index);
    quantities.remove(index);
}

public boolean isEmpty() {
    return shoppingCart.isEmpty();
}

public int size() {
    return shoppingCart.size();
}
 public double getTotal() {
        double total = 0;
        for (int i = 0; i < shoppingCart.size(); i++) {
            item it = shoppingCart.get(i);
            int qty = quantities.get(i);
            total += qty * it.getprice();
        }
        return total;
    }
}
