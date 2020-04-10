public abstract class Product implements Usable {
    protected boolean usable = true;
    protected String brand;
    protected int id;
    public Product(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    public void cleanUp() {
    }

    @Override
    public void setUsable(boolean usable) {
        this.usable = usable;
    }

}
