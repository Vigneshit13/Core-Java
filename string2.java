import java.util.*;
class string2{
public static void main(String args[]) throws Exception{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
char ch[]=new char[a.length()];
for(int i=0;i<a.length();i++){
ch[i]=a.charAt(i);
}
int z=0;
char ch1[][]=new char[5][5];
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
ch1[i][j]=a.charAt(z);
z++;
}
}

for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print(" "+ch1[i][j]);
}
System.out.println("\n");
}

int pos=a.indexOf('t');
System.out.println(pos);
if((a.charAt(pos+5))==('o')&&(a.charAt(pos+10))==('o')){
System.out.println("GOT IT");

}

}
}
