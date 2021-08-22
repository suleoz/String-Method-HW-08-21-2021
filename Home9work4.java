package Homeworks2month;

public class Home9work4 {

	public static void main(String[] args) {
		
		

		//HW:  From an array of integer elements find the largest number.

		int largest=0;
		
		
		int [] arr = {1 ,3 ,1004, 56,600,80 ,19,} ;
	
				for(int a:arr) {
				if(a>largest) {
					largest=a;
				}
		
		}
		
		
		
		System.out.println(largest);
		
		
	}

}
