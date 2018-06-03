import java.util.*;
class arr2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a[]=new int[3];
int b[]=new int[3];
for(int i=0;i<=2;i++){
a[i]=sc.nextInt();
}
for(int j=0;j<=2;j++){
b[j]=sc.nextInt();
}
int alice=0,bob=0;
for(int k=0;k<=2;k++){
if(a[k]>b[k]){
alice=alice+1;
}else if(a[k]==b[k]){
alice=alice;
bob=bob;
}else{
bob=bob+1;
}
}
System.out.println(alice+" "+bob);
}
}
