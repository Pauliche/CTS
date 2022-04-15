package adapter;

public class DiscountA implements IDiscountA {

	public double calculateDiscountA(int value){
		
		if(value>100) {
			return 0.1;
		}
		if(value<=100) {
			return 0.05;
		}
		return 0;
	}

	
}
