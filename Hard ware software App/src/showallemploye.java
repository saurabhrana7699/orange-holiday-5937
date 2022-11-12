import java.util.List;

public class showallemploye {
public static void main(String[] args) {
	employeeIMPL emp = new employeeIMPL();
	List<Employee>	el = emp.allthedeta();
	el.forEach( s -> System.out.println(s));
}
}
