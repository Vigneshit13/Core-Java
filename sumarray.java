import java.util.*;
class sumarray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enterthe number of rows in the array...:");
int rows=sc.nextInt();
System.out.println("Enterthe number of columns in the array...:");
int cols=sc.nextInt();
int total=0;
int a[][]=new int[rows][cols];
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
System.out.println("Enter the Element at ("+i+","+j+"):");
a[i][j]=sc.nextInt();
total+=a[i][j];
}
}
System.out.println("Total Sum is:"+total);
}
}
