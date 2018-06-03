import java.util.*;
class arr1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int temp=0;
for(int j=0;j<n;j++){
temp=temp+a[j];
}
System.out.println(temp);
}
}
