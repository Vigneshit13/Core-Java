import java.util.*;
class factors{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enterthe number of elements in the array...:");
int n=sc.nextInt();
int arr1[]=new int[n];
for(int i=0;i<n;i++){
System.out.println("Enterthe element "+(i+1)+":");
arr1[i]=sc.nextInt();
}
int arr2[]=new int[n];
for(int i=0;i<n;i++){
int count=0;
for(int j=1;j<=arr1[i];j++){
if(arr1[i]%j==0){
count++;
}}
arr2[i]=count;
System.out.println("The factors of "+arr1[i]+" is "+arr2[i]);
}
int temp;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr2[i]<arr2[j]){
temp=arr2[i];
arr2[i]=arr2[j];
arr2[j]=temp;

int temp2=arr1[i];
arr1[i]=arr1[j];
arr1[j]=temp2;
}
}
}
for(int i=0;i<n;i++)
System.out.println(arr1[i]);
}
}
