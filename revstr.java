import java.util.*;
class revstr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
char ch[]=new char[a.length()];
for(int b=0;b<a.length();b++){
ch[b]=a.charAt(b);
}
for(int s=a.length()-1;s>=0;s--)
System.out.println(ch[s]);
}}

