import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class employeeIMPL implements employedao {

	@Override
	public String ragisteremploye(String username, String password, String category) {
		
		String massage = "Not added";
		
		try(Connection con=	daoutil.provideConnection()) {
		PreparedStatement ps=	con.prepareStatement("insert into hod values(?,?,?)");
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, category);
		
	int x = 	ps.executeUpdate();
	
	if(x > 0) {
		massage = "Record Inserted Successfully";
	}
		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return massage;
	}
	
	@Override
	public List<Employee> allthedeta() {
	
		List<Employee> empl = new ArrayList<>();
		
	
		
		try (Connection con =	daoutil.provideConnection()) {
		PreparedStatement ps =	con.prepareStatement("select * from hod");
		ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		
		String n = rs.getString("username");
		String p = rs.getString("password");
		String c = rs.getString("category");
	Employee employe = new Employee(n, p, c);
	empl.add(employe);
	}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empl;
	}

	@Override
	public String deleteemp(String name) {
		
		String msg = "Not Deleted Name Not Found";
		
	
		
		try (	Connection con = daoutil.provideConnection()){
		PreparedStatement ps =	con.prepareStatement("delete from hod where username = ?");
		ps.setString(1, name);
	int x =	ps.executeUpdate();
	if(x > 0) 
		msg = "record deleted successfully..";
	
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}

	
	@Override
	public String login(String uname, String pass) {
		
		String msg = "Incorrect deta";
		
		

	try(	Connection con = 	daoutil.provideConnection()) {
	PreparedStatement ps =	con.prepareStatement("select * from hod where username = ? and password = ?");
	
	ps.setString(1, uname);
	ps.setString(2, pass);
	
	ResultSet rs = ps.executeQuery();
	if(rs.next()) {
		msg = "Login Successfully";
	}
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return msg;
	}

	@Override
	public String updatepass(String uname ,String password) {
	
		String msg = "Not updated";
		
	Connection con =	daoutil.provideConnection();
	
	try {
	PreparedStatement ps =	con.prepareCall("update hod set password = ? where username =?");
		
	ps.setString(1, uname);
	ps.setString(2, password);
	
	int x = ps.executeUpdate();

	if(x>0) {
		msg = "Update Password Done";
	}
	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return msg;
	}

	@Override
	public String searchempfromcategoary(String cat) {
		
	
		String msg = "No one Employee with this category";
	try(Connection con=	daoutil.provideConnection()) {
	PreparedStatement ps =	con.prepareStatement("select * from hod where category = ?");
	ps.setString(1, cat);
	ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			String s = rs.getString("username");
			String p = rs.getString("password");
			String d = rs.getString("category");

				System.out.println(msg=	 "Username : "+s);
				System.out.println	( msg="Password : "+p);
				System.out.println( msg="Category : "+d);
				System.out.println();
			
				System.out.println("***********************************");
		
		}
		
	
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return msg;
	
	}

}
