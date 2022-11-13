import java.util.List;

public interface employedao {

	public  String ragisteremploye(String username, String password, String category);
	
	public List<Employee> allthedeta();
	
	
	public String deleteemp(String name);
	
	public String login(String uname , String pass);
	
	public String updatepass(String uname ,String password);
	
	public String searchempfromcategoary(String cat);
	
	
	
	
	
}
