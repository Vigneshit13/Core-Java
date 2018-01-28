public class pattern2{
	public static void main(String args[]){
	//5*5 EtoA Program(Row-wise)
        System.out.println("RightAngle Triangle  *  Row-wise");
        for(int i=0;i<5;i++){
                for(int j=0;j<=i;j++){
                        System.out.print("* ");
                }
        System.out.println();
        }

        System.out.println("RightAngle Triangle 1 to 5 Row-wise");
        for(int i=0;i<5;i++){
                for(int j=0;j<=i;j++){
                        System.out.print((i+1)+" ");
                }
        System.out.println();
        }
	
        System.out.println("RightAngle Triangle 1 to 5 Row-wise");
        for(int i=0;i<5;i++){
                for(int j=0;j<=i;j++){
                        System.out.print((j+1)+" ");
                }
        System.out.println();
        }
	
        System.out.println("RightAngle Triangle A to E Row-wise");
        for(char i='A';i<='E';i++){
                for(char j='A';j<=i;j++){
                        System.out.print(i+" ");
                }
        System.out.println();
        }
       
	 System.out.println("RightAngle Triangle A to E Column-wise");
        for(char i='A';i<='E';i++){
                for(char j='A';j<=i;j++){
                        System.out.print(j+" ");
                }
        System.out.println();
        }
	
        System.out.println("----------Triangle  Row-wise-----------");
        for(int i=5;i>0;i--){
                for(int j=i;j>0;j--){
                        System.out.print("* ");
                }
        System.out.println();
        }
        System.out.println("--------------Triangle  Row-wise---------------");
        for(int i=1;i<=5;i++){
                for(int j=5;j>=i;j--){
                        System.out.print(i+" ");
                }
        System.out.println();
        }

        System.out.println("--------------Triangle  Row-wise---------------");
        for(int i=5;i>=1;i--){
                for(int j=1;j<=i;j++){
                        System.out.print(j+" ");
                }
        System.out.println();
        }

	}
}
