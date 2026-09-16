public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Adding only cheese to pizza...");
    }
}