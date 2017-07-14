class Swap{

	public static void main(String args[]){
		int i=100,j=10;
		System.out.println("Before Swapping i = "+i+" and j = "+j);
		i = i+j;
		j = i-j;
		i = i-j;
		System.out.println("After Swapping i = "+i+" and j = "+j);
	}

}