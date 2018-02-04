public class pattern4{
public static void main(String args[]){
int n=5,z=5,y=5;
for(int i=1;i<=n;i++){
for(int j=1;j<i;j++){
System.out.print("  ");
}
for(int k=1;k<=z;k++){
System.out.print(" *");
}
z--;
System.out.println();
}

for(int i=1;i<=n;i++){
for(int j=1;j<i;j++){
System.out.print("  ");
}
for(int k=1;k<=y;k++){
System.out.print((char)(k+64)+" ");
}
y--;
System.out.println();
}
//Print numbers in pyramid
int size=5,z1=1;

for(int i=0;i<size;i++){
for(int j=size-1;j>i;j--){
System.out.print("  ");
}
for(int k=0;k<z1;k++){
System.out.print(z1+" ");
}
z1+=2;
System.out.println();
}
int z2=1;
for(int i=0;i<size;i++){
for(int j=size-1;j>i;j--){
System.out.print("  ");
}
for(int k=0;k<z2;k++){
System.out.print((z2-i)+" ");
}
z2+=2;
System.out.println();
}

}
}
