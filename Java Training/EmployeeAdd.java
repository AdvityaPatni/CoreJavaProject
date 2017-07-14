import java.util.*;
public class EmployeeAdd{

		ArrayList<EmployeeVo> al = new ArrayList<EmployeeVo>();

		public void add(String name,int age, double salary){ 

		EmployeeVo e1 = new EmployeeVo();
		e1.setName(name);
		e1.setAge(age);
		e1.setSalary(salary);
		al.add(e1);
		  
		}
		public ArrayList<EmployeeVo> getEmployeeList(){
			return al;
		}
		
}