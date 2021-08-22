package Homeworks2month;

public class Home10work1arrayRetrive {

	public static void main(String[] args) {

		
		//Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops

		
		String [][] cars= { {"Ford", "Chevrolet", "Buick", "Tesla", "Cadillac"},
							{"AUDI",  "BMW" , "Mercedes-Benz", " Opel" ," Porsche"},
							{"Hyundai" ," Kia"," Daewoo"},
							{"Fiat ", "Alfa Romeo" ," Maserati" ," Ferrari "," Lamborghini"}  };
		
		for (String [] a: cars) {
			
			for (String b:a) {
				
				System.out.print(b+" ");
			}
		}
		
		System.out.println("");
		
		System.out.println("==========");
		
		
		for (int a=0;a<cars.length;a++) {
			
			for(int b=0;b<cars[a].length;b++) {
				
				System.out.print(cars[a][b]+" ");
			}
		}
		
		
		
		
		
	}

}
