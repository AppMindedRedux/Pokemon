package be.intecbrussel.WordFilter;

public class App {

	public static void main(String[] args) {

		TextPrinter tp1 = new TextPrinter("Manchester United is the greatest club!");

		System.out.println(" *** Words containing letter 'e' *** ");
		tp1.printFilteredWords(new WordFilter() {

			@Override
			public boolean isValid(String s) {
				return s.contains("e");
			}
		});

		System.out.println();
		System.out.println(" *** Words more than 4 chars *** ");
		TextPrinter tp2 = new TextPrinter("Today is Thursday, a sunny day!");
		tp2.printFilteredWords(s -> s.length() > 4);

		System.out.println();
		System.out.println(" *** Words beginning with the letter 'a' *** ");
		TextPrinter tp3 = new TextPrinter("An alphabet starts with A");
		tp3.printFilteredWords(new WordFilter() {

			@Override
			public boolean isValid(String s) {
				return s.startsWith("a");
			}
		});

		System.out.println();
		System.out.println(" *** Words that have as 2nd letter 'e'  *** ");
		TextPrinter tp4 = new TextPrinter("De mooiste club van de wereld'");
		tp4.printFilteredWords(new WordFilter() {

			@Override
			public boolean isValid(String s) {
				return s.length() > 1 && s.charAt(1) == 'e';
			}
		});

		System.out.println();
		System.out.println(" *** Words that have as 2 x letter 'e'  *** ");
		TextPrinter tp5 = new TextPrinter("Deee rzerez  dfezze  eeeee ee!");
		tp5.printFilteredWords(s -> {

			int counter = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'e') {
					counter++;
				}

			}

			return counter == 2;

		});

	}

}
