class Construct{
	public static void main(String args[]){
	
		new Construct();
		new Construct(5,7);

	}	

	private Construct(){
		System.out.println("Private constructor");
	}
	public Construct(int i,int j){
		System.out.println("Public Constructor");
		System.out.println(i+j);
	}
	
}