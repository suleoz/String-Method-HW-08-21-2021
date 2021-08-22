package Homeworks2month;

public class Home9work2ARRAY {

	public static void main(String[] args) {
		// 2-Create an array of animals and store 6 elements into it. Using 2 different
		// loops print all elements from the array
		

		System.out.println("============hw2/1========");
		
		
		String []animals= {"MONKEY","DOG","LION","DUCK","HIPPO","DINOSAUR",};
		
		for(int i =0; i<animals.length;i++) {
			
			System.out.println(animals[i]);
		}
		
		System.out.println("============hw2/2=======");
		for(String arr:animals) {
			
			System.out.println(arr);
		}
		
	}

}
