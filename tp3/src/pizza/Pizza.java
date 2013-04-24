package pizza;

public class Pizza {

	public final static int COOKED = 0;
	public final static int BAKED = 1;
	public final static int DELIVERED = 2;

	private String name;

	int state = COOKED;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void bake() throws Exception {
		if (state == COOKED) {
			System.out.print("Baking the pizza...");
			state = BAKED;
		} else if (state == BAKED) {
			throw new Exception("Can't bake a pizza already baked");
		} else if (state == DELIVERED) {
			throw new Exception("Can't bake a pizza already delivered");
		}
	}

	public void deliver() throws Exception {
		if (state == COOKED) {
			throw new Exception("Can't deliver a pizza not baked yet");
		} else if (state == BAKED) {
			System.out.print("Delivering the pizza...");
			state = DELIVERED;
		} else if (state == DELIVERED) {
			throw new Exception("Can't deliver a pizza already delivered");
		}
	}

}

