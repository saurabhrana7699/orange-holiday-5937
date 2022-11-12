
public class Employee {
	String username ;
	String password;
	String category;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Employee(String username, String password, String category) {
		super();
		this.username = username;
		this.password = password;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", category=" + category + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
