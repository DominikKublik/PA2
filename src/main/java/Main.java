public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = Supermarket.getInstance();
        supermarket.prepare(25, 8);
        supermarket.makeReport();
    }
}
