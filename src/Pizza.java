public abstract class Pizza {
    public abstract void prepare();

    public void bake() {
        System.out.println("Baking your pizza in the oven...")
    }

    public void cut() {
        System.out.println("Cutting 8 perfect slices...")
    }

    public void box() {
        System.out.println("Boxing your pizza...")
    }
}