public class pattern3{
public static void main(String args[]){
	int n=5;
	int z=1,y=1,x=1;
	for(int i=1;i<=n;i++){
		for(int j=n-1;j>=i;j--){
		System.out.print("  ");
		}
	for(int k=1;k<=z;k++){
	System.out.print("* ");
		}
	z++;
	System.out.println();
	}

for(int i=1;i<=n;i++){
for(int j=n-1;j>=i;j--){
System.out.print("  ");
}
for(int k=1;k<=y;k++){

System.out.print(k+" ");
}
y++;
System.out.println();
}

for(int i=1;i<=n;i++){
for(int j=n-1;j>=i;j--){
System.out.print("  ");
}
for(int k=1;k<=x;k++){
System.out.print((char)(k-1+65)+" ");
}x++;
System.out.println();
}
}
}
