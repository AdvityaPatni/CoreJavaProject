import java.util.Date;

class DateDemo{

	public static void main(String args[]){

	Date date = new Date(98,5,21);
	Date date2= new Date(99,1,9);
	
	int comp = date.compareTo(date2);

	System.out.println(comp);

	}

}