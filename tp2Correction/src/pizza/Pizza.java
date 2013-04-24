package pizza;

public class Pizza implements PizzaState {

	public final static int COOKED = 0;
	public final static int BAKED = 1;
	public final static int DELIVERED = 2;

	private String name;

	// int state = COOKED;
	PizzaState state  = new CookedPizza(this);

	public void setState(PizzaState state) {
		this.state = state;
	}

	public void setState(int state) {
		 if(state == COOKED) { 
			 this.state = new CookedPizza(this);
			 } 
		 else if(state == BAKED) {
			 this.state = new BakedPizza();
			 
		 }

		 else if(state ==
			  DELIVERED) {
			 this.state = new DelivrededPizza();

		 }	
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PizzaState getState() {
		return state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pizza.PizzaState#bake()
	 */
	@Override
	public void bake() throws Exception {
		state.bake();
	}

	/*
	 * if(state == COOKED) { System.out.print("Baking the pizza..."); state =
	 * BAKED; } else if(state == BAKED) { throw new
	 * Exception("Can't bake a pizza already baked"); } else if(state ==
	 * DELIVERED) { throw new Exception("Can't bake a pizza already delivered");
	 * } }
	 *//*
		 * (non-Javadoc)
		 * 
		 * @see pizza.PizzaState#deliver()
		 */
	@Override
	public void deliver() throws Exception {
		state.deliver();
	}
}


/*
 * if(state == COOKED) { throw new
 * Exception("Can't deliver a pizza not baked yet"); } else if(state == BAKED) {
 * System.out.print("Delivering the pizza..."); state = DELIVERED; } else
 * if(state == DELIVERED) { throw new
 * Exception("Can't deliver a pizza already delivered"); } }
 */

