class Over{

	void func(){
		
		System.out.println("In func1");	
	
	}
	
	void func(int i){
		System.out.println("In func2 "+i);
	}

	double func(double i){
		System.out.println("In func3 " + i);
		return i;
	}

	void func(double i, int j){

		System.out.println("In func4 "+i+" "+j);	

	}

	boolean func(float i){
		if(i<0){
			return false;
		}
		else{
			return true;
		}
	}

	public static void main(String args[]){

	Over obj = new Over();
	
	obj.func();
	obj.func(5);
	boolean stat = obj.func(10.25f);
	System.out.println(stat);
	double num = obj.func(-9.3);
	obj.func(5.23,6);			
	System.out.println(num);
	}

}