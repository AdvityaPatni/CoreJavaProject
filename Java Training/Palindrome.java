import java.util.*;
class Palindrome{
	public static void main(String args[])
	{		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String");
		String word = scn.nextLine();
		int leng= word.length();
		char ch;
		String s=""; 
		for(int i=0 ; i<leng ; i++)
		{
			ch = word.charAt(i);
			s = ch+s;	
		} 
		if(s.equals(word)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		scn.close();
	}
}