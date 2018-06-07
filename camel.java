import java.util.*;
class camel{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
//char ch=str.toCharArray();
int upp=0;
for(int i=0;i<str.length();i++){
Character ch=str.charAt(i);
if(Character.isUpperCase(ch)){
upp=upp+1;
}
}
System.out.println(upp+1);
}
}
