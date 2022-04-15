package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB {

	@Override
	public double calculateDiscountB(Client client) {
		// TODO Auto-generated method stub
		//this.calculateDiscountB(client.getNrOrders())
		//return 0;
		System.out.println(Method B);
		int total=0;
		for(int=0;i<Client.getNrOrders();i++) {
			total+=client.getNrOrders()[i];
		}
		this.calculateDiscountA(total);
		return 0;
	}
	

}
