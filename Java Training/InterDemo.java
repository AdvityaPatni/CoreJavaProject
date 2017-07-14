class InterDemo implements demo2{

	public void display(){
	
		System.out.println("In Demo 2 Display");
	
	}

	public void print(){

		System.out.println("In Demo Print");
	}

	public static void main(String args[]){

	InterDemo obj = new InterDemo();
	obj.display();
	obj.print();	

}

}