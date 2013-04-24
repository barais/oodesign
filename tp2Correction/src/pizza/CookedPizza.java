package pizza;

public class CookedPizza implements PizzaState{

	Pizza pizza;
	
	public CookedPizza(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public void bake() throws Exception {
		System.out.print("Baking the pizza..."); 
		pizza.setState(Pizza.BAKED);
	}

	@Override
	public void deliver() throws Exception {
		throw new
		 Exception("Can't deliver a pizza not baked yet");		
	}

}
