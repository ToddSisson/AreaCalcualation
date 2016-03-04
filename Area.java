package num1;

public class Area {

	//circle
	public static double calcArea(double radius){
		return Math.PI * (radius * radius);
	}

	//rectangle
	public static double calcArea(int width, int length){
		return width * length;
	}
	
	//cylinder
	public static double calcArea(double radius, double height){
		return Math.PI * (radius * radius) * height;
	}

}
