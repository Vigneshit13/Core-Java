import java.util.*;
class reducedString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
char a[]=str.toCharArray();
int n=str.length();
char b[]=new char[n];
int x=0;
for(int i=n-1;i>0;i--){
if(a[i]!=a[i-1]){
b[x]=a[i];
System.out.println(b[x]);
x=x+1;
}
}
}
}
