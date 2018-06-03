import java.io.*;
import java.util.*;

public class str1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
	String str[]=new String[T];        
	for(int i=0;i<T;i++){
		str[i]=sc.next();
	}
	for(int i=0;i<T;i++){
		String t=str[i];int x=0,y=0;
		char ch[]=t.toCharArray();
		char c1[]=new char[t.length()];
		char c2[]=new char[t.length()];
		for(int j=0;j<t.length();j++){
			if(j%2==0){
				c1[x]=ch[j];x++;		
			}else{
				c2[y]=ch[j];y++;		
			}
		}
	for(int k=0;k<x;k++){
		System.out.print(c1[k]);
	}		System.out.print("  ");
	for(int k=0;k<y;k++){
		System.out.print(c2[k]);
	}
				System.out.println("");
	}
    }
}
