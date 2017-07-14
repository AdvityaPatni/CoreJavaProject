import java.util.*;

class Employee{

	public static void main(String args[]){
	
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Vikas");
		emp.add("Hitesh");
		emp.add("Kuldeep");
		emp.add("Shivam");
		emp.add("Vineet");
		
	//	Iterator it = emp.iterator();
	//	while(it.hasNext()){
	//		System.out.println(it.next());
	//	}
		
		for(String obj:emp){
			System.out.println(obj);
		}
		
	}

}