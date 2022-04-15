package adapter;

public class DiscountB implements IDiscountB{

public double calculateDiscountB(Client client){
		

	
	int total=0;
	for(int=0;i<client.getNrOrders();i++) {
		total+=client.getNrOrders()[i];
	}
	if(total>1000) {
		return 0.3;
	}
	if(total>500 && total<=1000) {
		return 0.2;
	}
	return 0;
	}

}
