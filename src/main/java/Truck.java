public class Truck extends Product {
    private int numberOfWheels;

    public Truck(String brand, int id, int numberOfWheels) {
        super(brand, id);
        this.numberOfWheels = numberOfWheels;
    }

    public boolean checkIfFashionable(int fashionableNumberOfWheels) {
        if (numberOfWheels == fashionableNumberOfWheels)
            this.setUsable(true);
        else
            this.setUsable(false);
        return this.usable;
    }

    @Override
    public boolean checkIfUsable() {
        return checkIfFashionable(Supermarket.getFashionableNumberOfWheels());
    }

}
