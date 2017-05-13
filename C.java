package first;



public class C extends B implements skeleton{
	void meth1(){
	System.out.println("This is from class C");
	}
	public static void main(String[] args) {
		C obj=new C();
		obj.sum(10, 20);
		obj.cube(10,20 ,30);
	}
	//int a=10,b=20;
	
	 public void sum(int a,int b){
		int sum=a+b;
		System.out.println("The Sum is "+sum);
	}
	 int d=10,e=20,f=30;
	@Override
	public void cube(int d, int e, int f) {
		int cubii=d*e*f;
		System.out.println("The cube of 3 number is "+cubii);
	}

}
