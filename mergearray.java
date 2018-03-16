import java.util.*;
class mergearray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of Array 1:");
int n1=sc.nextInt();
System.out.println("Enterthe sixeof array 2:");
int n2=sc.nextInt();
int a1[]=new int[n1];
int a2[]=new int[n2];
for(int i=0;i<n1;i++){
System.out.println("Enter the Element "+(i+1)+" value of Array 1");
a1[i]=sc.nextInt();
}

for(int i=0;i<n2;i++){
System.out.println("Enter the Element "+(i+1)+" value of Array 2");
a2[i]=sc.nextInt();
}
int n=n1+n2;
int a3[]=new int[n];
for(int i=0;i<n1;i++){
a3[i]=a1[i];
}
for(int i=n1,j=0;i<n;i++,j++){
a3[i]=a2[j];
}

for(int i=0;i<n;i++){
System.out.print(a3[i]+" ");
}
System.out.println();
System.out.println("Merged Array\n"+a3[0]);
for(int i=1;i<n;i++){
int flag=1;

for(int j=0;j<i;j++){
if(a3[j]==a3[i]){
flag=0;
break;
}
}

if(flag==1){
System.out.println(a3[i]);
}
}
}
}
