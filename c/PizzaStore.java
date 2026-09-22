import java.util.Scanner;

public class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza orderPizza(String type) {
        if (type == null || type.isEmpty()) {
            System.out.println("Hello? I can't hear you...");
            return null;
        }

        Pizza pizza = factory.createPizza(type);

        if (pizza == null) {
            System.out.println("Sorry, but we don't serve anything like that here...");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.finished();

        return pizza;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        System.out.println("Please pick cheese, pepperoni, greek, or glutenfree!");

        String type = scanner.nextLine();

        store.orderPizza(type);

        scanner.close();
    }
}