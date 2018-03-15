import java.util.*;
class pattern15{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String str=sc.nextLine();
int n=str.length();
char a[]=new char[str.length()];
for(int i=0;i<str.length();i++){
a[i]=str.charAt(i);
}

for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(i==j||i+j==n+1)
System.out.print(a[i-1]);

else
System.out.print(" ");
}
System.out.println();
}
}
}
