import com.niit.service.First;
import com.niit.service.Second;

class Third{

	public static void main(String args[]){
	
	Third ob = new Third();
	ob.call();
		

	}

	public void call(){

		First obj = new First();
		Second ob1 = new Second();
		int k = obj.i;
		System.out.println(k);
		System.out.println(ob1.j);
	
	}

}