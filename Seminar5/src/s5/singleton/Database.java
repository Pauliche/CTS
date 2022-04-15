package s5.singleton;

public class Database {

	private static Database INSTANCE ;

private Database() {
	
}

public static  Database getInstance() {
	if(INSTANCE==null) {
		synchronized(Database.class) {
			if(INSTANCE=null) {
				INSTANCE=new Database();
			}
		}
	}

		
		return INSTANCE;
	}
}

