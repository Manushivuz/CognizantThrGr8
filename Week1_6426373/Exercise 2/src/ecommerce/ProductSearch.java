package ecommerce;

public class ProductSearch {
    public static Product linearSearch(Product[] items, String targetName) {
        for (Product p : items) {
            if (p.getProductName().equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] items, String targetName) {
        int left = 0, right = items.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = items[mid].getProductName().compareToIgnoreCase(targetName);

            if (cmp == 0)
                return items[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }
}
