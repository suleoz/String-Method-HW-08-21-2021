package Homeworks2month;

public class Home9Work3 {

	public static void main(String[] args) {
		
		
		// 1- Create an array to store double values and then print those in reverse order


		// 2- Create an array on integers and calculate the sum of all elements in an array.
		
		double [] value = {11.2 , 5.99 , 13.99 , 76, 129.76} ;
		
		
		for (int i = value.length -1 ; i>=0 ;i--) {
			
			System.out.print(value[i] + " --");
			
		}
		
		
		
		System.out.println("=========hw4========");
		
		
		int [] add = {10 , 31 , 35 , 3 ,88 ,90};
		
		
		System.out.println(add[0]+add[1]+add[2]+add[3]+add[4]+add[5]);
		
		int sum = 0;
		
		for (int a =0 ; a<= add.length-1 ; a++) {
			 
			sum = sum+ add[a];
			
			

		}
		
		System.out.println(sum);
	}

}
