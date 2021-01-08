package BasicJavaSkills;


interface  Car {	
	void showColor();			
}

// class implementing car normally
  class BlueCar implements Car {
	public void showColor() {
		System.out.println("=== blue car ===== ");
	}
}



public class BasicJavaSkills {
	
	
	public static void main(String[] args) {
		
		
		// an instance of an unkownClass implementing car interface 
		Car greenCar = new Car() {
			public void showColor() {
				System.out.println("==== green car ==");
			}
		};
		greenCar.showColor();
		
		
		
		// an instance of unknown  class implementing car interface 
		Car redCar =  () -> System.out.println("==== red color =====");
		redCar.showColor();
		
		

		
		// an instance of BlueCar class which is implementing car interface 
	    Car blueCar = new BlueCar();
		blueCar.showColor();
		
	}
;
}
