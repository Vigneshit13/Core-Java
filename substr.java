import java.util.*;
class substr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string 1:");
String str1=sc.nextLine();
System.out.println("Enter the String2:");
String str2=sc.nextLine();
int z=0;
for(int i=0;i<=(str1.length()-str2.length());i++){
int flag=1;
for(int j=0;i<str1.length()&&j<str2.length();i++,j++){
if(str1.charAt(i)!=str2.charAt(j)){
flag=0;
break;
}
}

if(flag==1){
z=1;
System.out.println(i-str2.length());
}
}
if(z==0){
System.out.println("Not Found......");
}

}
}
