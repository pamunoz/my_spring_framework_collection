import java.sql.Connection;
import java.sql.SQLException;

public class FixedDepositService {
	public FixedDepositDetails getFixedDepositDetails(..) {
		
	}

	public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		Connection con = ...;
	
		try {
			con.setAutoCommit(false);
			//--execute SQL statements that modify database tables
			com.commit();
		} catch(SQLException sqle) {
			if (con != null) {
				con.rollback();
			}
		}
	}
}
