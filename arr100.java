import java.util.*;
class arr100{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the total Numbers:");
int a=sc.nextInt();
int num[]=new int[a];
for(int i=0;i<a;i++){
System.out.println("Enter Element "+(i+1)+":");
num[i]=sc.nextInt();
}
int temp;
for(int i=0;i<a;i++){
for(int j=i+1;j<a;j++){
if(num[i]>num[j]){
temp=num[i];
num[i]=num[j];
num[j]=temp;
}
}
}
int z=1,y=0;
int c[]=new int[a*2];
System.out.println("Ascending Order:");
for(int i=0;i<a;i++){
c[z]=num[i];
z+=2;
System.out.println(num[i]);
}
System.out.println("Descending order:");
for(int i=a-1;i>=0;i--){
c[y]=num[i];
System.out.println(num[i]);
y+=2;
}
System.out.println("Mixed:");
for(int i=0;i<a;i++){
System.out.println(c[i]);
}
}
}



