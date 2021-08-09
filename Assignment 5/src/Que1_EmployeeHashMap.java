import java.util.HashSet;
import java.util.Iterator;

class Employee{
	int id;
	String name;
	String department;
	int salary;
	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
public class Que1_EmployeeHashMap {

	public static void main(String[] args) {
		
		HashSet<Employee> set=new HashSet<Employee>();
		set.add(new Employee(1,"Amruta","IT",20000) );
		set.add(new Employee(2,"Aniket","Mech",25000));
		set.add(new Employee(3,"Yogita","IT",20000) );
		set.add(new Employee(4,"Dhanu","CBO",21000) );
		
	  Iterator<Employee> it=set.iterator();
	     while (it.hasNext())
	     {
	    	 Employee employee = (Employee) it.next();
	    	 System.out.println(employee);
	     }
	}
	
}
