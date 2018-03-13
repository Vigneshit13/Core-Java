class largest{

public static void main(String args[]){
int a[]={7,1,2,4,1};
//System.out.println(largest(a,5));

//public int largest(int a[],int total){
int temp,total=5;
for(int i=0;i<total;i++){
for(int j=i+1;j<total;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
int b[]=new int[total];
for(int i=0;i<total;i++){
b[i]=a[i];
System.out.println(b[i]);
}
}

//System.out.println(a[total-1]);

}
//}
