package Flujos_de_Control;

public class Condicionales {

	public void If() {
		
		int time = 22;
		
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}

	}
	
	public void Switch() {
		
		int day = 4;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		
	}
	
}
