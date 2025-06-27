package ecommerce;
import java.util.Arrays;
public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Headphones", "Electronics"),
                new Product(104, "Notebook", "Stationery"),
                new Product(105, "Smartphone", "Electronics")
        };

        Product found1 = ProductSearch.linearSearch(products, "Shoes");
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not found"));

        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));

        Product found2 = ProductSearch.binarySearch(products, "Shoes");
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not found"));
    }
}
