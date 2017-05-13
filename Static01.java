package first;

public class Static01 {
	static int a=5;
	int b=10;
	public static void main(String[] args) {
		System.out.println(a);
		Static01 obj1 = new Static01();
		System.out.println(obj1.b);
		obj1.b=500;
		System.out.println("The value of A is" + obj1.b);
		Static01 obj2 = new Static01();
		System.out.println(obj2.b=300);
	}
}
