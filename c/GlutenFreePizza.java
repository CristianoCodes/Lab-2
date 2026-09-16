public class GlutenFreePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Ensuring pizza is gluten free...");
    }
}