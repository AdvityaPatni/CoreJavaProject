class A{
	 int i=10,j=20,k=60;
}
class inherit extends A{
	 int i=5,j=6,k=7;
		void prin(){
			System.out.println(super.i);
			System.out.println(super.j);
			System.out.println(super.k);
				
			inherit obj = new inherit();
		
		System.out.println("Child class");
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
			}
	public static void main(String args[]){
			
	inherit ob = new inherit();
	ob.prin();
		
	}
}