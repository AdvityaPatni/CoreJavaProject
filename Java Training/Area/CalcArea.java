import java.util.*;
class CalcArea{

	public static void main(String args[]){
	
	//CalcArea obj = new CalcArea();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Shape");
	String shape = sc.nextLine();
	
	switch(shape){
	case "SQUARE" : Square obj = new Square();
					obj.areas();
					break;
	
	case "CIRCLE" : Circle obj1 = new Circle();
					obj1.areas();
					break;
	
	case "RECTANGLE" : Rectangle obj2 = new Rectangle();
					obj2.areas();
					break;
					
	default : System.out.println("Invalid Input");
		}
	
	}
}