import java.util.*;
class pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int z=0;
for(int i=n-1;i>=0;i--){
for(int j=i-1;j>=0;j--){
//space
System.out.print(" ");
}
for(int k=0;k<=z;k++){
//print#
System.out.print("#");

}
//nextLine
z=z+1;
System.out.println();
}
}
}
