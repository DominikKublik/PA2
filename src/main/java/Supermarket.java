import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Supermarket {

    public static Supermarket INSTANCE = null;
    private static int storeTemperature;
    private static int fashionableNumberOfWheels;
    private List<Product> listOfProducts = new LinkedList<>();
    private Supermarket() {
    }

    public static Supermarket getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Supermarket();
        }
        return INSTANCE;
    }

    public static int getStoreTemperature() {
        return storeTemperature;
    }

    public static int getFashionableNumberOfWheels() {
        return fashionableNumberOfWheels;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void prepare(int storeTemperature, int fashionableNumberOfWheels) {
        Supermarket.storeTemperature = storeTemperature;
        Supermarket.fashionableNumberOfWheels = fashionableNumberOfWheels;
        generateProducts();
    }

    public void generateProducts() {
        listOfProducts.add(new Milk("Milk1", 1, 23));
        listOfProducts.add(new Milk("Milk2", 666, 30));
        listOfProducts.add(new Truck("Truck1", 452, 24));
        listOfProducts.add(new Truck("Truck2", 2316, 8));
        listOfProducts.add(new Shovel("Shovel1", 2223, Material.CHOCOLATE, Size.SMALL));
        listOfProducts.add(new Shovel("Shovel2", 9372, Material.STEEL, Size.BIG));
    }

    public void makeReport() {
        Map<String, Integer> usableProducts = new HashMap<>();
        usableProducts.put("Milk", 0);
        usableProducts.put("Truck", 0);
        usableProducts.put("Shovel", 0);

        for (Product product : listOfProducts) {
            if (product.checkIfUsable()) {
                usableProducts.put(product.getClass().getName(), usableProducts.get(product.getClass().getName()) + 1);
            } else {
                product.cleanUp();
            }
        }
        printReport(usableProducts);
    }

    public void printReport(Map<String, Integer> report) {
        System.out.println("Usable:");
        for (Map.Entry<String, Integer> reportEntry : report.entrySet()) {
            System.out.println(reportEntry.getKey() + "s: " + reportEntry.getValue());
        }
    }

    public void clearSupermarket() {
        while (listOfProducts.size() != 0) {
            listOfProducts.remove(0);
        }
    }



}
