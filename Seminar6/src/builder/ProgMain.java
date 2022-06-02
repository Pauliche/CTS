package builder;

public class ProgMain {

	public static void main(String[] args) {
	
		User user=new User.Userbuilder("Pauliche", "123", "paul@csie").address("bucharest").build();

	}

}