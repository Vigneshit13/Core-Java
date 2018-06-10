import java.util.*;
class cipher{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String str=sc.next();
n=str.length();
int size=sc.nextInt();
if(size>26){
size=size%26;
}

char a[]=str.toCharArray();
char b[]=new char[n];
for(int i=0;i<n;i++){
if((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z')){
b[i]=((char)(a[i]+size));
if((a[i]>='A' && a[i]<='Z') && ((int)(a[i]+size)>90)){
int c=(int)(a[i]+size);
c=c-26;
System.out.print((char)(c));
}else if((int)(a[i]+size)>122){
int c=(int)(a[i]+size);
c=c-26;
System.out.print((char)(c));
}else{
System.out.print(b[i]);
}
}else{
b[i]=a[i];
System.out.print(b[i]);
}
}
}
}
