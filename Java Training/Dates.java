import java.util.Date;
import java.text.*;
class Dates{

	public static void main(String args[]){

	Date dt = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
	System.out.println(dt);
	System.out.println(sf.format(dt));
	
	Date ds = new Date("15/01/2017");
	System.out.println(ds);
	

}

}