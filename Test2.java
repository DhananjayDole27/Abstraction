package abstraction.Interface.connection;

public class Test2 {
	
	public static void main(String[] args) {
		Connection con = new Mysql();
		 con.commit();
		 con.rollback();

	}


}
