public class pattern7{
public static void main(String args[]){
int z=1,n=5;
for(int i=1;i<=5;i++){
for(int j=n-1;j>=i;j--){System.out.print("  ");}
for(int k=1;k<=z;k++){
System.out.print(((char)(z-k+65))+" ");
}System.out.println();
z+=2;
}
z=1;
int l=1;;
for(int i=1;i<=5;i++){
for(int j=n-1;j>=i;j--){System.out.print("  ");}
for(int k=1;k<=z;k++){
System.out.print((Math.abs(k-l))+" ");
}
l++;z+=2;System.out.println();
}
}
}
