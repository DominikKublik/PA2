import java.util.LinkedList;
import java.util.List;

public class Cafeteria {
    public static Cafeteria INSTANCE = null;
    private List<Product> products = new LinkedList<>();

    private Cafeteria() {
    }

    public static Cafeteria getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Cafeteria();
        }
        return INSTANCE;
    }

    public void addToCafeteria(Milk milk) {
        products.add(milk);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void clearCafeteria() {
        while (products.size() != 0) {
            products.remove(0);
        }
    }
}
