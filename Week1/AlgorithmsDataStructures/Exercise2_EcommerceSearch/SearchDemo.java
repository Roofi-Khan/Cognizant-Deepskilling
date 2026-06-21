package Week1.AlgorithmsDataStructures.Exercise2_EcommerceSearch;

public class SearchDemo {

    public static Product linearSearch(
            Product[] products,
            String name) {

        for(Product p : products) {

            if(p.productName.equalsIgnoreCase(name))
                return p;
        }

        return null;
    }

    public static Product binarySearch(
            Product[] products,
            String name) {

        int left = 0;
        int right = products.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            int result =
                products[mid].productName.compareToIgnoreCase(name);

            if(result == 0)
                return products[mid];

            if(result < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

            new Product(1,"Laptop","Electronics"),
            new Product(2,"Mouse","Electronics"),
            new Product(3,"Phone","Electronics")
        };

        Product found =
            linearSearch(products,"Mouse");

        if(found != null)
            System.out.println("Found: "
                    + found.productName);
    }
}
