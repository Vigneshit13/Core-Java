package test;
import java.util.*;
public class Tobinary {
public static void main(String[] args) {
	

	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=scanner.nextInt();
	int a[]=new int[1000];
	int x=0;
	while (num>0) {
		a[x]=num%2;
		x++;
		num=num/2;
		
	}
	for(int j=x-1;j>=0;j--){
		System.out.println(a[j]);
	}
}
}
