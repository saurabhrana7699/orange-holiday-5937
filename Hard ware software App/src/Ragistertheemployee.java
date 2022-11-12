import java.util.Scanner;

public class Ragistertheemployee {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Type UserName");
	String uname = sc.nextLine();
	System.out.println("Type Password");
	String pass = sc.nextLine();
	System.out.println("Type Category");
	String cat = sc.nextLine();
	
	
	
	employeeIMPL emp = new employeeIMPL();
	
	String res = emp.ragisteremploye(uname, pass, cat);
	
	System.out.println(res);
}
}
