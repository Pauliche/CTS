package decorator;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		APizza pizzaBasic = new PizzaBasic();
		System.out.println("Pizza Basic");
		pizzaBasic.getIngredients();
		pizzaBasic.calculateCost();
		APizza aPizza = new DecoratorChickenPizza(pizzaBasic);
		System.out.println("Pizza Chicken");
		aPizza.getIngredients();
		aPizza.calculateCost();
	
	}

}
