package Week1.AlgorithmsDataStructures.Exercise1_Inventorymanagementsystem;

import java.util.HashMap;

public class InventoryManagement {

    private HashMap<Integer, Product> inventory =
            new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(int id, int quantity) {

        if(inventory.containsKey(id)) {
            inventory.get(id).setQuantity(quantity);
        }
    }

    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    public void displayProducts() {

        for(Product p : inventory.values()) {
            p.display();
        }
    }

    public static void main(String[] args) {

        InventoryManagement ims =
                new InventoryManagement();

        ims.addProduct(
            new Product(101,"Laptop",10,50000));

        ims.addProduct(
            new Product(102,"Mouse",50,500));

        ims.displayProducts();

        ims.updateProduct(101,20);

        ims.deleteProduct(102);

        System.out.println("\nAfter Update:");

        ims.displayProducts();
    }
}