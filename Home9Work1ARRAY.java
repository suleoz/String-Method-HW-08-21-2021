package Homeworks2month;

public class Home9Work1ARRAY {

	public static void main(String[] args) {

		// 1-Create an array of cars and store 6 elements into it. Using 2 different
		// loops print all values from the array.

		

		System.out.println("---------HW 1-1-------");

		String[] cars = { "TOYOTA", "Ford", "Audi", "BMW", "KIA", "TESLA" };

		for (int a = 0; a < cars.length; a++) {

			System.out.println(cars[a]);
		}

		System.out.println("===========HW 1-2=================");

		for (String car : cars) {

			System.out.println(car);
		}

	}

}
