package builder;

public class Main {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaiianPizzaBuilder);
		waiter.constructPizza();		
		
		System.out.println(waiter.getPizza().toString());	

	}
}
