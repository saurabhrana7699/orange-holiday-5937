import java.util.Scanner;

public class loginemp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type login name");
		String name = sc.nextLine();
		System.out.println("Type login password");
		String pass = sc.nextLine();
		
		employeeIMPL emp = new employeeIMPL();
		
		System.out.println(emp.login(name, pass));
		
	}

}
