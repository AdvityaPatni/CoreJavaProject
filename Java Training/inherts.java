class inherits extends C{
	 int i=5,j=6,k=7;
		void prin(){
			System.out.println(super.i);
			System.out.println(super.j);
			System.out.println(super.k);
				
			inherits obj = new inherits();
		
		System.out.println("Child class");
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
			}
	public static void main(String args[]){
			
	inherits ob = new inherits();
	ob.prin();
		
	}
}