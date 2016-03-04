package num1;

public class AreaProgram {

	public static void main(String[] args) {
		
		// Area of a circle
	    System.out.printf("Area of a circle: %.2f\n",
	    		Area.calcArea(5.0));

	    // Area of a rectangle
	    System.out.printf("Area of a rectangle: %.2f\n",
	            Area.calcArea(15, 25));

	    // Area of cylinder
	    System.out.printf("Area of a cylinder: %.2f\n",
	            Area.calcArea(12.0, 17));
	}

}
