package LambdaActionApp;

public class LambdaActionApp {

	@FunctionalInterface
	interface FuncInter1 {

		int operation(int a, int b);
	}

	@FunctionalInterface
	interface FuncInter2 {

		void sayMessage(String s);
	}

	private int operate(int a, int b, FuncInter1 fObj) {

		return fObj.operation(a, b);
	}

	public static void main(String[] args) {
		
		FuncInter1 add = (int x, int y) -> x + y;
		LambdaActionApp app = new LambdaActionApp();
		
		System.out.println("Addition is: " + app.operate(6, 3, add));
		System.out.println("Multiplication is : " + app.operate(6, 3, (x, y) -> x * y));
		
		FuncInter2 fobj = msg -> System.out.println("Hello " + msg);
		
		fobj.sayMessage("Alex");
		
	

	}

}
