public class pattern6{
	public static void main(String args[]){
	int n=5,z=1,y=1,x=1;
	for(int i=1;i<=5;i++){
	for(int j=n-1;j>=i;j--){
	System.out.print("  ");	
	}
	for(int k=1;k<=z;k++){
	System.out.print(k+" ");
	}
	z+=2;
	System.out.println();
	}

	for(int i=1;i<=5;i++){
	for(int j=n-1;j>=i;j--){System.out.print("  ");}
	for(int k=1;k<=y;k++){System.out.print(((char)(k+64))+" ");}
	y+=2;
	System.out.println();
	}
	
	for(int i=1;i<=5;i++){
	for(int j=n-1;j>=i;j--){
	System.out.print("  ");}
	for(int k=1;k<=x;k++){System.out.print(((char)(x-k+65))+" ");}
	x+=2;System.out.println();
	}
}
}
