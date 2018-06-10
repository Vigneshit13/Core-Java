import java.util.*;
class kan{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x1,v1,x2,v2;
x1=sc.nextInt();
v1=sc.nextInt();
x2=sc.nextInt();
v2=sc.nextInt();
int j1=x1+v1,j2=x2+v2;
boolean a=false;
if(v1>v2){
for(int i=0;i<10000;i++){
if(j1==j2){
a=true;
}else if(j1!=j2){
j1=j1+v1;
j2=j2+v2;
a=false;
}
}
}
else{
a=false;
}
if(a==true)
System.out.println("YES");
else
System.out.println("NO");

}
}
