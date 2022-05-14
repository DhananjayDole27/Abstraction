package abstraction.Interface.connection;

public class Test1 {

	public static void main(String[] args) {
		Connection con = new Oracle();
		 con.commit();
		 con.rollback();

	}

}
