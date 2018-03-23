package test;
import java.util.*;
public class MisMatching {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of array 1:");
	int a1=scanner.nextInt();
	int a[]=new int[a1];
	for(int i=0;i<a1;i++){
		System.out.println("Enter the Element "+(i+1)+":");
		a[i]=scanner.nextInt();
	}
	System.out.println("Enter the size of array 2:");
	int a2=scanner.nextInt();
	int b[]=new int[a2];
	for(int j=0;j<a2;j++){
		System.out.println("Enter the Element "+(j+1)+":");
		b[j]=scanner.nextInt();
	}
	
	for(int i=0;i<a1;i++){
			
			if(a[i]!=b[i]){
				System.out.println("{"+a[i]+","+b[i]+"}");
				
			}
		
		
	}

}
}
