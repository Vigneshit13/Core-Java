import java.util.*;
class grandchild{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of pairs of child and parent....");
int n=sc.nextInt();
String a[][]=new String[n][2];
for(int i=0;i<n;i++){
for(int j=0;j<1;j++){
System.out.println("Enter Child "+(i+1)+":");
a[i][j]=sc.next();
System.out.println("Enter Parent "+(i+1)+":");
a[i][j+1]=sc.next();

}
}
//a[0][0]="assigned";


for(int i=0;i<n;i++){
for(int j=0;j<1;j++){
System.out.println("------------------------------------------\n"+"<"+a[i][j]+","+a[i][j+1]+">");
}
}
System.out.println("Enter the name to find grand children:");
String name=sc.next();
String child="";
for(int i1=0;i1<n;i1++){
if(name.equals(a[i1][1])){
child=a[i1][0];
}
}
/*
else{
System.out.println("........No Children.......");
}*/
int count=0;
String s1[]=new String[5];
for(int i2=0;i2<n;i2++){
if(child.equals(a[i2][1])){

s1[count]=a[i2][0];

System.out.println("Grand Children "+(count+1)+":"+s1[count]);
count++;
}
}
System.out.println();
/*
for(String fin:s1){
System.out.print(fin+"...");
}

*/

}
}
