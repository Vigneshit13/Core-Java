import java.util.*;
class grade{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int b[]=new int[n];
for(int i=0;i<n;i++){
if(a[i]<38){
b[i]=a[i];
}else if((a[i]%5)==0 || (a[i]%5)<3){
b[i]=a[i];
}else if((a[i]%5)==4){
b[i]=a[i]+1;
}else if((a[i]%5)>=3){
b[i]=a[i]+((a[i]%5)-1);
}
}
for(int i=0;i<n;i++){
System.out.println(b[i]);
}
}
}
