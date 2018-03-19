import java.util.*;
class sumweight{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of the areay...");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
System.out.println("Enter the Element "+(i+1)+":");
a[i]=sc.nextInt();
}
System.out.println("--------------------Given Elements--------------------");

for(int z:a){
System.out.println(z+" ");
}
int temp;
for(int i=0;i<n;i++){
for(int j=1;j<n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("----------------------------------------");

for(int nu1:a)
System.out.println(nu1);
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=0;
int sq=(int)Math.sqrt(a[i]);
if((sq*sq) == a[i]){
arr[i]=arr[i]+5;
}
if(a[i]%4==0 && a[i]%6==0){
arr[i]+=4;
}
if(a[i]%2==0){
arr[i]+=3;
}
}
for(int x=0;x<n;x++){
System.out.println("<"+a[x]+","+arr[x]+">");
}
}
}
