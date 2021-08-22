package Homeworks2month;

public class Home10Work2 {

	public static void main(String[] args) {
		
		//Using 2D array create a grocery list.
		//Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
	
	
	String [][] list= { 
				{"tomato","cucumber","squash"}, 
				{"apple","watermelon","banana"},
				{"cheese" ,"milk",},
				{"candy","coco","coton candy"}
			
	};
	
	for (String[] a:list) {
		
		for(String b:a) {
			
			System.out.print(b+ " ,");
		}
	}
	
	System.out.println("");
	System.out.println("");

	
	for (int a=0; a< list.length;a++) {
		
		for(int b=0 ; b<list[a].length;b++) {
			
			System.out.print(list[a][b]+",");
		}
	}
	
	
	
	
	
	
	
	
	
	}

}
