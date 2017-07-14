import java.util.*;

class Arr{

	public static void main(String args[]){
	
	int a[]=new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length");
	int lengt = sc.nextInt();
	for(int i=0;i<lengt;i++){
		a[i] = sc.nextInt();
	}

	for(int i=lengt-1;i>=0;i--){
		System.out.println(a[i]);
	}
}

}