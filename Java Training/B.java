class A{
	static int i=10,j=20,k=60;
}
class B extends A{
	 int i=5,j=6,k=7;
		B(){
			System.out.println(super.i);
			System.out.println(super.j);
			System.out.println(super.k);	
			}
	public static void main(String args[]){
		
		B obj = new B();
		
		System.out.println("Child class");
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
	}
}