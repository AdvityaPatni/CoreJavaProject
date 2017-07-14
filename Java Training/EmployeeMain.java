import java.util.*;
class EmployeeMain{ 

	ArrayList<EmployeeVo> al = new ArrayList<EmployeeVo>();
	//ArrayList<Double> sal = new ArrayList<Double>();
	public void addEmployee(){
	
		EmployeeAdd obj = new EmployeeAdd();
		obj.add("Kuldeep",25,25000.0);
		obj.add("Ayush",22,22000.0);
		obj.add("Hitesh",23,23000.0);
		obj.add("Jolly",20,15000.0);
		obj.add("Jitendra",35,35000.0);
		al = obj.getEmployeeList();
}	
	public void printEmpAge(){
		System.out.println("Age of Employees");
		for(EmployeeVo e : al){
			System.out.println(e.getAge());
		}
	}
	
	public void printEmpName(){
		System.out.println("Name of Employees");
		for(EmployeeVo e : al){
			System.out.println(e.getName());
	}
}
	public void printEmpSalary(){
		System.out.println("Salary of Employees");
		for(EmployeeVo e : al){
			System.out.println(e.getSalary());
	}	
}

	public void printAscSalary(){
		ArrayList<Double> sal = new ArrayList<Double>();
		
		for(EmployeeVo e : al){
			
			sal.add(e.getSalary());
		}
		Collections.sort(sal);
		for(double s : sal){
			for(EmployeeVo e : al){
				if(s == e.getSalary()){
					System.out.println("Name : "+e.getName()+"   Salary : "+s);
				}
			}
		}
	}
	
	
	public static void main(String args[]){
	
		EmployeeMain obj1 = new EmployeeMain();
		obj1.addEmployee();
		obj1.printEmpName();
		obj1.printEmpAge();
		obj1.printEmpSalary();
		obj1.printAscSalary();
		
	}

}