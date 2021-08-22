package Homeworks2month;

public class Dog {
	
	String name;
	
	void bark() {
		
		System.out.println(name + " can bark");
	}
	
	void play () {
		System.out.println(name +" loves to play catch");
	}
	
	void bite () {
		
		System.out.println(name+" bites");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog husky =new Dog ();
		Dog bulldog =new Dog();
		Dog labrador =new Dog();
		
		husky.name="Husky";
		husky.play();
		
		
		
		bulldog.name="Bulldog";
		bulldog.bite();
		
		labrador.name="Labrador";
		labrador.bark();
		
		
		
		
		
		
		
		
		
		

	}

}
