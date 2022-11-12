import java.util.Scanner;

public class deletetheemployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		employeeIMPL emp = new employeeIMPL();
		
		System.out.println("Type Name for Delete ");
		String n = sc.nextLine();
		
		System.out.println(emp.deleteemp(n));
	}
}
