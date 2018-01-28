public class pattern1{
	public static void main(String args[]){
//5*5 Star program
        System.out.println("Star Program");
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			System.out.print("* ");
		}
	System.out.println();
	}

//5*5 1to5 Program(Row-wise)
        System.out.println("1 to 5 Pattern row-wise");
        for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                        System.out.print(i+" ");
                }
        System.out.println();
        }
//5*5 1to5 Program(Column-wise)
        System.out.println("1 to 5 Column-wise");
        for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                        System.out.print(j+" ");
                }
        System.out.println();
        }

//5*5 a to e Program(Row-wise)
        System.out.println("A to E Row-wise");
        for(char i='A';i<='E';i++){
                for(char j='A';j<='E';j++){
                        System.out.print(i+" ");
                }
        System.out.println();
        }
//5*5 A to E Program(Column-wise)
        System.out.println("A to E Column-wise");
        for(char i='A';i<='E';i++){
                for(char j='A';j<='E';j++){
                        System.out.print(j+" ");
                }
        System.out.println();
        }

//5*5 EtoA Program(Row-wise)
        System.out.println("E to A Row-wise");
        for(char i='E';i>='A';i--){
                for(char j='E';j>='A';j--){
                        System.out.print(i+" ");
                }
        System.out.println();
        }
//5*5 EtoA Program(Column-wise)
        System.out.println("E to A Column-wise");
        for(char i='E';i>='A';i--){
                for(char j='E';j>='A';j--){
                        System.out.print(j+" ");
                }
        System.out.println();
        }

}	
}
