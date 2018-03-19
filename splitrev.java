import java.util.*;
class splitrev{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String s1[]=str.split(" ");
for(int i=0;i<s1.length;i++){
System.out.println(s1[i]);
}
System.out.println("-----------------Rotation--------------------\nEnter Number of Rotations:");
int num=sc.nextInt();
//String s2[]=new String[s1.length];
for(int i=0;i<s1.length;i++){
System.out.print(s1[(i+s1.length-num)%s1.length]+" ");
}
System.out.println("-----------------Reverse by Words------------");
for(int i=s1.length-1;i>=0;i--){
System.out.print(s1[i]+" ");
}
}
}
