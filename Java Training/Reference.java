class A{
	int i=1,j=2,k=3,l=10;
}

class inherited extends A{
	 int i=5,j=6,k=7;
	
	public static void main(String args[]){
		A ob1 = new inherited();	
		inherited ob = new inherited();
		
		System.out.println(ob1.l);
		System.out.println(ob.l);
	}
}