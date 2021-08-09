class employee{
	int total;
	public int salary(int fixsalary,int addon) {
		total=fixsalary+addon;
		return total;
	}
}

class manager extends employee{
	int totalManagerSalary;
	public int salary(int fixsalary,int addon) {
		totalManagerSalary=fixsalary+addon;
		return totalManagerSalary;
	}
}

class labour extends employee{
	int totalLabourSalary;
	public int salary(int fixsalary,int addon) {
		totalLabourSalary=fixsalary+addon;
		return totalLabourSalary;
	}	

}
public class Que2_Salary {

	public static void main(String[] args) {
		int TotalSalary;
		employee M=new manager();
		employee L=new labour();
		TotalSalary=M.salary(10000, 500)+L.salary(50000, 200);
		System.out.println("Total salary of employee is : "+TotalSalary);

	}

}
