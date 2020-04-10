public class Milk extends Product {
    private int storageTempLimit;

    public Milk(String brand, int id, int storageTempLimit) {
        super(brand, id);
        this.storageTempLimit = storageTempLimit;
    }

    public boolean checkIfGoesSour(int marketTemperature) {
        if (marketTemperature > this.storageTempLimit) {
            this.setUsable(false);
        }
        return usable;
    }

    @Override
    public boolean checkIfUsable() {
        return checkIfGoesSour(Supermarket.getStoreTemperature());
    }

    @Override
    public void cleanUp() {
        Cafeteria cafeteria = Cafeteria.getInstance();
        cafeteria.addToCafeteria(this);
    }
}
