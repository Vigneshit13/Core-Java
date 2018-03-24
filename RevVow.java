package test;
import java.util.*;
public class RevVow {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s1=scanner.nextLine();
	char a[]=new char[s1.length()+5];
	for(int i=0;i<s1.length()-1;i++){
		a[i]=s1.charAt(i);
		}
	char s2[]=new char[s1.length()];
	for(int i=0;i<s1.length();i++){
		s2[i]=s1.charAt(i);
	}
	String vow="aeiouAEIOU";
	int count=0;
	for(int i=0;i<s1.length();i++){
		System.out.println(i+":time");
		for(int j=0;j<vow.length();j++){
			System.out.println(j+":time");
			if(a[i]==vow.charAt(j)){
			System.out.println("inside iff");	
			System.out.println("Vowel found at :"+i);
			count++;
			
			}
		}
	}
}
}
