import java.util.Random;

public class Shovel extends Product {
    private int chanceOfBeingStolen;
    private Material material;
    private Size size;
    public Shovel(String brand, int id, Material material, Size size) {
        super(brand, id);
        this.material = material;
        this.size = size;
        this.chanceOfBeingStolen = size.getChanceToSteal();
    }

    public boolean checkIfStolen(int chanceOfBeingStolen) {
        Random random = new Random();
        if (random.nextInt(100) + 1 <= chanceOfBeingStolen)
            this.setUsable(false);
        return usable;
    }

    @Override
    public boolean checkIfUsable() {
        return checkIfStolen(this.chanceOfBeingStolen);
    }
}
