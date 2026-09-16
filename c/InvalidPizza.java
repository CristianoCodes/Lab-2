public class InvalidPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Sorry, but we don't serve anything like that here...");
        System.exit(0);
    }
}