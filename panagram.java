import java.util.*;
class panagram{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int n=str.length();
str=str.toLowerCase();
boolean bool=true;
for(char ch='a';ch<='z';ch++){
if(!str.contains(String.valueOf(ch))){
bool=false;
break;
}
}
if(bool)
System.out.println("pangram");
else
System.out.println("not pangram");
}
}
