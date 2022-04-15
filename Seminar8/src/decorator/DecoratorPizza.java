package decorator;

public abstract class DecoratorPizza extends APizza {

	//obj concret
	protected APizza aPizza;
	publicDecoratorPizza(APizza p){
		
		this.aPizza=p;
	}
	
	@Override
	public void getIngredients() {
		// TODO Auto-generated method stub
		aPizza.getIngredients();
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		aPizza.calculateCost();
	}

}
