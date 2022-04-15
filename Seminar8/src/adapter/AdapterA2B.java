package adapter;

public class AdapterA2B extends DiscountB implements IDiscountA {

	@Override
	public double calculateDiscountB(Client client) {
		// TODO Auto-generated method stub
		return super.calculateDiscountB(client);
	}

}
