import java.util.*;
class palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=new char[str.length()];
for(int i=0;i<str.length();i++){
ch[i]=str.charAt(i);
}
System.out.println("Given String: "+ch);
int j=0;
char ch1[]=new char[str.length()];
for(int i=str.length()-1;i>=0;i--){
ch1[j]=str.charAt(i);
j++;
}
System.out.println("Reverse Of Number:"+ch1);
}
}
