package builder;
/*Concrete Builder*/
public class HawaiianPizzaBuilder extends PizzaBuilder{
	@Override
	public void buildDough() {
		pizza.setDough("Hawaian dough");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("fresh sauce");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("pineapple");	
	}
}
