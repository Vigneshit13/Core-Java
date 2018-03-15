class pattern19{
public static void main(String args[]){
int n=5;
for(int i=1;i<=5;i++){
for(int j=n-1;j>=i;j--){
System.out.print(" ");
}
System.out.print(i);
for(int j=1;j<(i-1)*2;j++){
System.out.print(" ");
}
if(i>1){
System.out.print(i);}
System.out.println();
}
}
}
