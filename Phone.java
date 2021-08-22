package Homeworks2month;

public class Phone {
	
	String name;
	String color;
	String operator;
	
	
	void ring () {
		
		System.out.println(name +" rings");
	}
	
	
	void play () {
		
		System.out.println("With "+name+" you can play games");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Phone iphone=new Phone();
		
		Phone android=new Phone();
		
		Phone nokia=new Phone();
		
		
		iphone.name="Iphone";
	
		
		iphone.ring();
		
		
		android.name="Android";
		
		android.play();
		
		nokia.name="Nokia";
		
		nokia.ring();
		
		
		
		
		
		
		
		
		

	}

}
