package Thai.dev;

import Thai.dev.Circle;
import Thai.dev.Shape;
import Thai.dev.Square;
import Thai.dev.Triangle;

public class JavaInheritance {
	public static void main(String[] args) {
		
		
		
		double max = 0; 
		double min = 0;
		
		Shape shapes[] = new Shape[10];
		
		shapes[0] = new Square (6, 5);
		shapes[1] = new Square (6,7);
		shapes[2] = new Square (8,5);
		shapes[3] = new Square (8,6);
		shapes[4] = new Circle (5);
		shapes[5] = new Circle (7);
		shapes[6] = new Circle (9);
		shapes[7] = new Triangle (6,6,7);
		shapes[8] = new Triangle (5,8,7);
		shapes[9] = new Triangle (7,4,9);
		
		for(int i = 0; i < shapes.length; i++)
			System.out.println("Dien tich: " + shapes[i].dienTich());
		
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i].dienTich() > max)
				max = shapes[i].dienTich();
		}
		
		min = shapes[0].dienTich();
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i].dienTich() < min)
				min = shapes[i].dienTich();
		}
		
		System.out.println("Dien tich phan tu lon nhat: "+max);
		System.out.println("Dien tich phan tu be nhat: "+min);
	}
}