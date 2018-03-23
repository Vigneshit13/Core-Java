package test;
import java.util.*;
public class Union {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array 1:");
		int a=sc.nextInt();
		int x[]=new int[a];
		for(int i=0;i<a;i++){
		System.out.println("Enter the element "+(i+1)+":");
		x[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array 2:");
		int b=sc.nextInt();
		int y[]=new int[b];
		for(int i=0;i<b;i++){
		System.out.println("Enter the element "+(i+1)+":");
		y[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
		System.out.println(x[i]);
		}
		for(int i=0;i<b;i++){
		System.out.println(y[i]);
		}
		int u[]=new int[a+b];
		for(int i=0;i<a;i++){
		u[i]=x[i];

		}
		int flag=0,k=a;
		for(int i=0;i<b;i++){
		for(int j=0;j<a;j++){
		if(y[i]!=x[j]){
		//System.out.print(y[j]);
		flag=1;
		}else{
		flag=0;
		break;
		}
		}
		if(flag==1){
			
		u[k]=y[i];
			k++;
			}
			}
			System.out.println(".......Union...........");
			for(int i=0;i<k;i++){
			System.out.print(u[i]+" ");
			}
int p=0;
int intr[]=new int[a];
	for(int i=0;i<b;i++){
		for(int j=0;j<a;j++){
			if(x[i]==y[j]){
				flag=1;
				break;
			}else{
				flag=0;
			}
		}
		if (flag==1) {
			intr[p]=y[i];
			p++;
		}
	}
	System.out.println("---Intersection----");
	if(p>1){
	for(int i=0;i<p-1;i++){
		
		System.out.println(intr[i]+" ");
	}System.out.println(intr[p-1]);
	}else {
		System.out.println("null set");
	}
	}}



