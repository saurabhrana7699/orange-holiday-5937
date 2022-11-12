import java.util.Scanner;

public class updatepassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type New Password");
		String u = sc.nextLine();
		
		System.out.println("Type Username");
		String p = sc.nextLine();
		
		employeeIMPL emp = new employeeIMPL();
		
		System.out.println(emp.updatepass(u, p));
	}

}
