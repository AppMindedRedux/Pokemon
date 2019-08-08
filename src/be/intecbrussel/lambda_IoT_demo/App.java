package be.intecbrussel.lambda_IoT_demo;

public class App {

	public static void main(String[] args) {

//		FuncInterface fObj = new FuncInterface() {
//			
//			@Override
//			public void speak() {
//
//				System.out.println("This is quite cumbersome!");
//			}
//		};
//		
//		fObj.speak();
//		fObj.speakDefault();
//		
//		fObj = new FuncInterface() {
//			
//			@Override
//			public void speak() {
//				
//				System.out.println("We made a change!");
//				
//			}
//		};
//		
//		fObj.speak();
		
		// verschil tussen anonieme klasse en Lambda:
		// bij Lambda worden geen extra klassen in de bin map aangemaakt
		
		FuncInterface pObj = () -> System.out.println("Js makes me want to flip the table and say" + " 'Fuck this shit', but  I can never be sure what 'This ' refers to");
		
		pObj.speak();
		
		int a = 5;
		Square s = (int x) -> x * x;
		System.out.println(s.calculate(a));
		
		
		
		s = x -> x * x;
		System.out.println(s.calculate(a));
		
		
	}

}
