package be.intecbrussel.lambda_IoT_demo;

@FunctionalInterface
public interface FuncInterface {

	void speak();
	

	default void speakDefault() {

		System.out.println("No rest for the wicked!");
	}

}
