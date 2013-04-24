package pizza;

public class BakedPizza implements PizzaState{

	@Override
	public void bake() throws Exception {
		
	}

	@Override
	public void deliver() throws Exception {
		System.err.println("deliver");
	}

}
