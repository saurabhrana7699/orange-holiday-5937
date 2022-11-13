import java.util.Scanner;

public class Searchempbycategory {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Type Category");
	String cat = sc.nextLine();
	
	
	employeeIMPL emp = new employeeIMPL();
	
	System.out.println(emp.searchempfromcategoary(cat));
}
}
