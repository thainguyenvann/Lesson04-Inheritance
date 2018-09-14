package Thai.dev;

    public class Triangle extends Shape {
	 
	private int a;
	private int b;
	private int c;
	
	public Triangle(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
 	@Override
	public double Dientich() {
		// TODO Auto-generated method stub
		return Math.sqrt(((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4);
	}
}