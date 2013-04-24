package pizza;

public class BakedPizza implements PizzaState{

	
	Pizza pizza;
	
	public BakedPizza(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	
	@Override
	public void bake() throws Exception {
		throw new Exception("Can't bake a pizza already baked");

		
	}

	@Override
	public void deliver() throws Exception {
		System.err.println("deliver");
		pizza.setState(new DelivrededPizza(pizza));
	}

}
