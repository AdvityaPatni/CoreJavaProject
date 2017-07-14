class Accessi{
	public int i=1;
	private int j = 2 ; 
	protected int k = 3;
}

class M extends Accessi{
	 int i=5,j=6,k=7;
	
	public static void main(String args[]){
		Accessi ob1 = new M();	
		M ob = new M();
		
		System.out.println(ob1.i);
		//System.out.println(ob1.j); 
		System.out.println(ob1.k);
	}
}