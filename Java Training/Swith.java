import java.util.*;
class Swith{

	public static void main(String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Character :- ");
	char ch = sc.next(".").charAt(0);
	switch(ch){
			case 'X' : System.out.println("Hi");break;
			case 'Y' : System.out.println("Hi Hi");break;
			case 'Z' : System.out.println("Hello Hello");break;
			default : System.out.println("Invalid Character");
	}	

}

}