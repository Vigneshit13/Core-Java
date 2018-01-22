import java.util.*;
public class Programs2{

Scanner sc=new Scanner(System.in);

public static void main(String args[]) throws Exception{
Programs2 ob=new Programs2();
System.out.println("Enter number:\n1.Sample array\n2.User defined 1D Array\n3.Sample 2D Array\n4.Merge Array\n5.Remove Duplicates");
Scanner sc1=new Scanner(System.in);
int a=sc1.nextInt();
switch(a){
case 1:ob.array1();break;
case 2:ob.array2();break;
case 3:ob.array3();break;
case 4:ob.array4();break;
case 5:ob.array5();break;
}}
void array1(){
int a[]=new int[10];
a[0]=12;
a[2]=22;
for(int i=0;i<10;i++){
System.out.println(" "+a[i]);
}}
void array2(){
try{
System.out.println("Enter the number of elements to enter:");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
System.out.println("Enter the num "+(i+1)+":");
a[i]=sc.nextInt();
}

for(int i=0;i<10;i++){
System.out.println("Element "+(i+1)+":"+a[i]);
}
}catch(Exception e){
System.out.println("");
}
}
void array3(){
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
System.out.println("Total Elements:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print((a[i][j]=i)+" ");
System.out.print((b[i][j]=i+3)+" ");
}}
System.out.println("\n\nGenerated Matrix 1:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("Generated Matrix 2:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(b[i][j]+" ");
}System.out.println();
}
/*add();
System.out.println("Enter choice :\n1.Add Matrix\n2.Sub Matrix \n3.Multiply Matrix");
int n=sc.nextInt();
switch(n){
case 1:add();break;
case 2:sub();break;
case 3:multiply();break;
}*/
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
c[i][j]=0;
	for(int k=0;k<3;k++){
	c[i][j]+=a[i][k]*b[k][j];
}
}}
System.out.println("Muliplication of TWO Matrix:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(c[i][j]+" ");
}
System.out.println();
}}
void array4(){
int a[]={1,2,3};
int b[]={4,5,6};
for(int i=0;i<3;i++){
System.out.println("Two arrays of index "+i+":"+a[i]+"and"+b[i]);
}
int merge[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++){
merge[i]=a[i];
}
for(int i=0;i<b.length;i++){
merge[i+a.length]=b[i];
}
System.out.println("Merged Array is:");
System.out.println(Arrays.toString(merge));
}
void array5(){
System.out.println("Enter 5 Elements:");
int a[]=new int[5];
for(int i=0;i<5;i++){
a[i]=sc.nextInt();}
int b;
//int b[]=new int[5];
//for(int i=0;i<5;i++){
System.out.println(b=Arrays.stream(a).distinct().toArray());
//}
}
}

