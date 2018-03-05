import java.util.*;
class string1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String a=sc.next();
System.out.println(a);
char s[]=a.toCharArray();
System.out.println(s[0]+""+s[4]);
for(int i=a.length()-1;i>=0;i--){
System.out.println(s[i]);
}
}
}
