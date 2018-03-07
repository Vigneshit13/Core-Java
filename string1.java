import java.util.*;
class string1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
System.out.println(a);
char s[]=a.toCharArray();
System.out.println("First and Fifth index:"+s[0]+""+s[4]);
System.out.println("Reverse Of String:");
for(int i=a.length()-1;i>=0;i--){
System.out.print(s[i]);
}
System.out.println("\n"+"Split():");

String str1[]=a.split("e");
for(String w:str1){
System.out.println(w.trim());
}
}
}
