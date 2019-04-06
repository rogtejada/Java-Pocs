package builder;
/*Concrete Builder*/
public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("spicy dough");		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot sauce");		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pepperoni");		
	}

}
