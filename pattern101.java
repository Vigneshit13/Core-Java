import java.util.*;
class pattern101{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size :");
int size=sc.nextInt();
int n[]=new int[1000000];
n[0]=3;
n[1]=4;
int k=1;
for(int i=0;i<size;i++){
n[++k]=(n[i]*10)+3;
n[++k]=(n[i]*10)+4;
}

for(int k1=0;k1<size;k1++){
System.out.print(n[k1]+" ");
}
}
}
