import java.util.ArrayList;
import java.util.Scanner;

public class Grocery {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<item> storeitems = new ArrayList<>();
    public static ArrayList<Customer> info = new ArrayList<>();
    public static ArrayList<supplier> Supplier = new ArrayList<>();

    public static void addItemToCart() {
        storeitems.add(new item(1, "Shampoo", "Personal Care", 100, 25));
        storeitems.add(new item(2, "Bread", "Bakery", 200, 15));
        storeitems.add(new item(3, "Iron", "Electronics", 75, 200));
        storeitems.add(new item(4, "Apples", "Fruits and Vegetables", 75, 25));
        storeitems.add(new item(5, "PS5", "Electronics", 100, 500));
        storeitems.add(new item(6, "Cucumber", "Fruits and Vegetables", 75, 15));
    }

    public static void addcustomers() {
        info.add(new Customer(1, "Areej Fatima", 24, "January", 2025));
        info.add(new Customer(2, "Eelaf Masood", 13, "September", 2024));
    }

    public static void addsupplier() {
        Supplier.add(new supplier("Ahmed", 13));
        Supplier.add(new supplier("Abdullah", 27));
    }

    public static void displaylist() {
        System.out.println("\n--- Items at Grocery Store ---");
        for (int i = 0; i < storeitems.size(); i++) {
            System.out.println("Item " + (i + 1) + ":");
            storeitems.get(i).display();
            System.out.println("--------------------------");
        }
    }

    public static void displaycustomers() {
        System.out.println("\n--- Customer Information ---");
        for (int i = 0; i < info.size(); i++) {
            System.out.println((i + 1) + ". " + info.get(i).getName());
        }
    }

    public static void displaysuppliers() {
        System.out.println("\n--- Supplier Information ---");
        for (int i = 0; i < Supplier.size(); i++) {
            Supplier.get(i).display();
            System.out.println("--------------------------");
        }
    }
   public static void edititems() {
    System.out.println("Enter ID of item to be edited:");
    int edid = scanner.nextInt();
    scanner.nextLine();
    boolean found = false;

    for (int i = 0; i < storeitems.size(); i++) {
        if (storeitems.get(i).itemid() == edid) {
            found = true;
            System.out.println("1. To edit item ID");
            System.out.println("2. To edit item name");
            System.out.println("3. To edit quantity in stock");
            System.out.println("4. To edit price");
            System.out.print("Enter option: ");
            int opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("Enter new item ID: ");
                    int newid = scanner.nextInt();
                    scanner.nextLine();
                    storeitems.get(i).setid(newid);
                    break;
                case 2:
                    System.out.print("Enter new item name: ");
                    String newname = scanner.nextLine();
                    storeitems.get(i).setitemname(newname);
                    break;
                case 3:
                    System.out.print("Enter new quantity: ");
                    int newqty = scanner.nextInt();
                    scanner.nextLine();
                    storeitems.get(i).setqtyinstock(newqty);
                    break;
                case 4:
                    System.out.print("Enter new price: ");
                    int newprice = scanner.nextInt();
                    scanner.nextLine();
                    storeitems.get(i).setprice(newprice);
                    break;
                default:
                    System.out.println("Invalid option entered!");
            }
            break; 
        }
    }

    if (!found) {
        System.out.println("Item with ID " + edid + " not found.");
    }
}
public static void editcustomers() {
    System.out.println("Enter ID of customer to be edited:");
    int id = scanner.nextInt();
    scanner.nextLine();
    boolean found = false;

    for (int i = 0; i < info.size(); i++) {
        if (info.get(i).getId() == id) {
            found = true;
            System.out.println("1. Edit name");
            System.out.println("2. Edit address");
            System.out.println("3. Edit date of order");
            System.out.print("Enter option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter new name: ");
                    String newname = scanner.nextLine();
                    info.get(i).setName(newname);
                    break;

                case 2:
                    Address addr = info.get(i).getAddress();
                    System.out.println("1. Edit house number");
                    System.out.println("2. Edit society");
                    System.out.println("3. Edit city");
                    System.out.print("Enter option: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:
                            System.out.print("Enter new house number: ");
                            int newhousenum = scanner.nextInt();
                            scanner.nextLine();
                            addr.sethousenumber(newhousenum);
                            break;
                        case 2:
                            System.out.print("Enter new society: ");
                            String newsociety = scanner.nextLine();
                            addr.setsociety(newsociety);
                            break;
                        case 3:
                            System.out.print("Enter new city: ");
                            String newcity = scanner.nextLine();
                            addr.setcity(newcity);
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;

                case 3:
                    DOO date = info.get(i).getDate();
                    System.out.println("1. Edit day");
                    System.out.println("2. Edit month");
                    System.out.println("3. Edit year");
                    System.out.print("Enter option: ");
                    int opt = scanner.nextInt();
                    scanner.nextLine();

                    switch (opt) {
                        case 1:
                            System.out.print("Enter new day: ");
                            int newday = scanner.nextInt();
                            scanner.nextLine();
                            date.setdate(newday);
                            break;
                        case 2:
                            System.out.print("Enter new month: ");
                            String newmonth = scanner.nextLine();
                            date.setmonth(newmonth);
                            break;
                        case 3:
                            System.out.print("Enter new year: ");
                            int newyear = scanner.nextInt();
                            scanner.nextLine();
                            date.setyear(newyear);
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;

                default:
                    System.out.println("Invalid option entered!");
            }
            break; 
        }
    }
    if (!found) {
        System.out.println("Customer with ID " + id + " not found.");
    }
}
public static void editsuppliers() {
    System.out.println("Enter ID of supplier to be edited:");
    int id = scanner.nextInt();
    scanner.nextLine();
    boolean found = false;

    for (int i = 0; i < Supplier.size(); i++) {
        if (Supplier.get(i).getid() == id) {
            found = true;
            System.out.println("1. Edit name");
            System.out.println("2. Edit ID");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter new name: ");
                    String newname = scanner.nextLine();
                    Supplier.get(i).setname(newname);
                    break;
                case 2:
                    System.out.print("Enter new ID: ");
                    int newid = scanner.nextInt();
                    scanner.nextLine();
                    Supplier.get(i).setid(newid);
                    break;
                default:
                    System.out.println("Invalid option entered!");
            }
            break; 
        }
    }
    if (!found) {
        System.out.println("Supplier with ID " + id + " not found.");
    }
}
public static void editorder(Order customerorder) {
    if (customerorder.isEmpty()) {
        System.out.println("Your cart is currently empty!");
        return;
    }
    customerorder.displayCart();
    System.out.print("Enter item number of item to be edited: ");
    int i = scanner.nextInt() - 1;
    scanner.nextLine();

    if (i < 0 || i >= customerorder.size()) {
        System.out.println("Invalid index!");
        return;
    }

    item selecteditem = customerorder.getItem(i);
    int currentqty = customerorder.getQuantity(i);

    System.out.println("1. Change quantity");
    System.out.println("2. Remove item");
    System.out.print("Enter option: ");
    int opt = scanner.nextInt();
    scanner.nextLine();

    switch (opt) {
        case 1:
            System.out.print("Enter new quantity to be bought: ");
            int newqty = scanner.nextInt();
            scanner.nextLine();

            if (newqty < 0) {
                System.out.println("Invalid amount entered");
            } else if (newqty > selecteditem.getqtyinstock() + currentqty) {
                System.out.println("Not enough stock available!");
            } else {
                
                selecteditem.setqtyinstock(selecteditem.getqtyinstock() + currentqty - newqty);
                customerorder.updateQuantity(i, newqty);
                System.out.println("Quantity updated!");
            }
            break;

        case 2:
            selecteditem.setqtyinstock(selecteditem.getqtyinstock() + currentqty);
            customerorder.removeItem(i);
            System.out.println("Item removed from order.");
            break;

        default:
            System.out.println("Invalid option.");
            break;
    }
}

    public static Customer selectOrAddCustomer() {
        while (true) {
            System.out.println("\nSelect a customer by number, or enter 0 to add a new customer:");
            displaycustomers();
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                addCustomerInteractive();
            } else if (choice > 0 && choice <= info.size()) {
                return info.get(choice - 1);
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void searchByCategory() {
        scanner.nextLine();
        System.out.println("Enter category to search:");
        String cat = scanner.nextLine().trim();
        boolean found = false;
        for (int i = 0; i < storeitems.size(); i++) {
            item current = storeitems.get(i);
            if (current.getcategory().equalsIgnoreCase(cat)) {
                current.display();
                System.out.println("----------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this category.");
        }
    }

    public static void editCategory() {
        System.out.println("Enter item ID to edit category:");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < storeitems.size(); i++) {
            item current = storeitems.get(i);
            if (current.itemid() == id) {
                System.out.println("Enter new category:");
                String newCat = scanner.nextLine().trim();
                current.setcategory(newCat);
                System.out.println("Category updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public static void placeorder(Customer customer) {
        System.out.println("\nCurrent order for " + customer.getName() + ":");
        if (customer.getOrder().isEmpty()) {
            System.out.println("No previous orders.");
        } else {
            customer.getOrder().displayCart();
            System.out.printf("Current Bill: $%.2f\n", customer.getOrder().getTotal());
        }

        displaylist();

        System.out.println("Enter ID of the product to be purchased:");
        int orderid = scanner.nextInt();
        scanner.nextLine();

        item selecteditem = null;
        for (int i = 0; i < storeitems.size(); i++) {
            item current = storeitems.get(i);
            if (current.itemid() == orderid) {
                selecteditem = current;
                break;
            }
        }

        if (selecteditem == null) {
            System.out.println("Item not found!");
            return;
        }

        System.out.println("Enter quantity to buy:");
        int qtyToBuy = scanner.nextInt();
        scanner.nextLine();

        if (qtyToBuy > selecteditem.getqtyinstock()) {
            System.out.println("Not enough stock available.");
        } else {
            customer.getOrder().addToCart(selecteditem, qtyToBuy);
            selecteditem.setqtyinstock(selecteditem.getqtyinstock() - qtyToBuy);
            System.out.println("Item added to your order!");
        }
    }

    public static void declareStarOfTheMonth() {
        if (info.isEmpty()) {
            System.out.println("No customers available.");
            return;
        }
        Customer topCustomer = null;
        double highestBill = 0;
        for (int i = 0; i < info.size(); i++) {
            Customer customer = info.get(i);
            double total = customer.getOrder().getTotal();
            if (total > highestBill) {
                highestBill = total;
                topCustomer = customer;
            }
        }
        if (topCustomer != null) {
            System.out.println("\n STAR OF THE MONTH");
            System.out.println("Customer: " + topCustomer.getName());
            System.out.printf("Total Bill: $%.2f\n", highestBill);
        } else {
            System.out.println("No orders placed yet.");
        }
    }

    public static void addItemInteractive() {
        System.out.println("Enter new item ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter item name:");
        String name = scanner.nextLine();

        System.out.println("Enter category:");
        String cat = scanner.nextLine();

        System.out.println("Enter quantity in stock:");
        int qty = scanner.nextInt();

        System.out.println("Enter price:");
        int price = scanner.nextInt();
        scanner.nextLine();

        storeitems.add(new item(id, name, cat, qty, price));
        System.out.println("Item added successfully.");
    }

    public static void addCustomerInteractive() {
        System.out.println("Enter customer ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter month of order:");
        String month = scanner.nextLine();

        System.out.println("Enter year of order:");
        int year = scanner.nextInt();
        scanner.nextLine();

        info.add(new Customer(id, name, age, month, year));
        System.out.println("Customer added successfully.");
    }
    public static void addSupplierInteractive() {
    System.out.println("Enter supplier ID:");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter supplier name:");
    String name = scanner.nextLine();

    Supplier.add(new supplier(name, id));
    System.out.println("Supplier added successfully.");
}

    public static void main(String[] args) {
    addItemToCart();
    addcustomers();
    addsupplier();

    int opt = -1;
    while (opt != 0) {
        System.out.println("\nMain Menu:");
        System.out.println("1. Manage items");
        System.out.println("2. Manage orders");
        System.out.println("3. Manage customer info");
        System.out.println("4. Manage supplier info");
        System.out.println("5. Manage category");
        System.out.println("0. Exit");
        System.out.print("Enter your option: ");
        opt = scanner.nextInt();
        scanner.nextLine();

        switch (opt) {
            case 1: 
                System.out.println("1. View items");
                System.out.println("2. Add new item");
                System.out.println("3. Edit existing item");
                System.out.print("Enter your choice: ");
                int itemOpt = scanner.nextInt();
                scanner.nextLine();

                switch (itemOpt) {
                    case 1:
                        displaylist();
                        break;
                    case 2:
                        addItemInteractive();
                        break;
                    case 3:
                        edititems();
                        break;
                    default:
                        System.out.println("Invalid item option.");
                }
                break;

            case 2: // Orders menu
                Customer customer = selectOrAddCustomer();

                boolean orderMenu = true;
                while (orderMenu) {
                    System.out.println("\nOrder Menu for " + customer.getName() + ":");
                    System.out.println("1. Add items to order");
                    System.out.println("2. View order");
                    System.out.println("3. Edit order");
                    System.out.println("4. Return to main menu");
                    System.out.print("Enter your choice: ");
                    int orderOpt = scanner.nextInt();
                    scanner.nextLine();

                    switch (orderOpt) {
                        case 1:
                            placeorder(customer);
                            break;
                        case 2:
                            if (customer.getOrder().isEmpty()) {
                                System.out.println("Order is empty.");
                            } else {
                                customer.getOrder().displayCart();
                                System.out.printf("Total Bill: $%.2f\n", customer.getOrder().getTotal());
                            }
                            break;
                        case 3:
                            editorder(customer.getOrder());
                            break;
                        case 4:
                            orderMenu = false;
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                }
                break;

            case 3: // Customer info menu
                System.out.println("\n1. View Customers");
                System.out.println("2. Add Customer");
                System.out.println("3. Edit Customer");
                System.out.println("4. Star of the Month");
                System.out.print("Enter your choice: ");
                int custOpt = scanner.nextInt();
                scanner.nextLine();

                switch (custOpt) {
                    case 1:
                        displaycustomers();
                        break;
                    case 2:
                        addCustomerInteractive();
                        break;
                    case 3:
                        editcustomers();
                        break;
                    case 4:
                        declareStarOfTheMonth();
                        break;
                    default:
                        System.out.println("Invalid customer option.");
                }
                break;

            case 4: // Supplier info menu
                System.out.println("\n1. View Suppliers");
                System.out.println("2. Add Supplier");
                System.out.println("3. Edit Supplier");
                System.out.print("Enter your choice: ");
                int supOpt = scanner.nextInt();
                scanner.nextLine();

                switch (supOpt) {
                    case 1:
                        displaysuppliers();
                        break;
                    case 2:
                        addSupplierInteractive();
                        break;
                    case 3:
                        editsuppliers();
                        break;
                    default:
                        System.out.println("Invalid supplier option.");
                }
                break;

            case 5: 
                System.out.println("1. Search by category");
                System.out.println("2. Edit item category");
                System.out.print("Enter your choice: ");
                int catOpt = scanner.nextInt();
                scanner.nextLine();
                if (catOpt == 1) {
                    searchByCategory();
                } else if (catOpt == 2) {
                    editCategory();
                } else {
                    System.out.println("Invalid category option.");
                }
                break;

            case 0:
                System.out.println("Exiting program. Goodbye!");
                break;

            default:
                System.out.println("Invalid main menu option.");
        }
    }
}


}
