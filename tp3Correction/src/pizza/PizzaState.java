package pizza;

public interface PizzaState {

	public abstract void bake() throws Exception;

	public abstract void deliver() throws Exception;

}