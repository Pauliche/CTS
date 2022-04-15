package adapter;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]v=new int[2];
		v[0]=100;
		v[1]=50;
		Client c=new Client("Paul",2,v);
		IDiscountB discount = new AdapterB2A();
		discount.calculateDiscountB(c);
	}

}
