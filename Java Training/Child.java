class Child extends Parent{
	
	int add(int num1, int num2, int num3){
		int sum = num1+num2+num3;
		return sum;}
	public static void main(String args[]){
		Child obj = new Child();
		int add = obj.add(5,7);
		System.out.println(add);
		add = obj.add(5,7,9);
		System.out.println(add);
			}
	
}