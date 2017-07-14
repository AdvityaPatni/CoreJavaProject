class Excep1{
	int i;
	public static void main(String args[]){
		try{
		Excep1 obj = new Excep1();
		obj = null;
		System.out.println(obj.i);
		}
		
		catch(Exception e){
				System.out.println("In Exceptio");
		
		}
		
		catch(NullPointerException e){
			System.out.println("In Exception");
		}
		
	}

}