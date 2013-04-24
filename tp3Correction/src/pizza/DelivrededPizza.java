package pizza;

public class DelivrededPizza implements PizzaState{

	Pizza pizza;
	
	public DelivrededPizza(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	@Override
	public void bake() throws Exception {
		throw new Exception("Can't bake a pizza already delivered");

	}

	@Override
	public void deliver() throws Exception {
		throw new Exception("Can't deliver a pizza already delivered");
	}

}
