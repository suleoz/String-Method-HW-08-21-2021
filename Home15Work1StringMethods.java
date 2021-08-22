package Homeworks2month;

public class Home15Work1StringMethods {

	public static void main(String[] args) {

		System.out.println("=========TASK1=============");

		String sentence = "This is a string method homework";

		System.out.println(sentence.replace(" ", "")); // Thisisastringmethodhomework

		System.out.println("========TASK2============");

		String alpha = "SUlete98@%76.5*4";

		String length = alpha.replaceAll("[^a-z0-9A-Z]", "");

		System.out.println(length.length()); // 12

		System.out.println("===========TASK3============");

		String split = "Is it saturday? Is it raining? Do we have a Java Class today?";

		String[] array = split.split("[?]");

		System.out.println(array.length); // 3

		System.out.println("=============TASK4=========");

		String reverseIt = "This is a string method homework";

		String reversed = "";

		for (int i = reverseIt.length() - 1; i >= 0; i--) {

			reversed = reversed + reverseIt.charAt(i);

		}
		System.out.println(reversed); // krowemoh dohtem gnirts a si sihT

		System.out.println("===============TASK5===========");

		String wordByword = "This is a string method homework";

		String reverse = "";

		String[] arr = wordByword.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {

			reverse = reverse + arr[i];
			System.out.print(arr[i] + " "); // homework method string a is This

		}

		System.out.println("========TASK6============");

		String given = "Level";

		String rev = "";

		for (int i = given.length() - 1; i >= 0; i--) {

			rev = rev + given.charAt(i);

		}
		System.out.println(rev);

		if (given.equalsIgnoreCase(rev)) {

			System.out.println(given + " is palindrome");
		} else {
			System.out.println(given + " is not palindrome");
		}

		System.out.println("========TASK7==========");

		String a = "Sen";
		String b = "Ben";

		a = a + b; // senben b=senben-ben=sen == a-b=sen

		b = a.substring((a.length() - a.length()), b.length());

		System.out.println(b); // sen

		// a=senben == senben-sen=ben ==ay-a=ben
		
		a = a.substring(a.length() - b.length(), a.length());

		System.out.println(a);

	}

}
