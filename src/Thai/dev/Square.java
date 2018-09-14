
package Thai.dev;
public class Square extends Shape {
	private double chieudai;
	private double chieurong;
	
	public Square(double chieudai, double chieurong) {
		this.chieudai= chieudai;
		this.chieurong= chieurong;
	}
	@Override
	public double Dientich() {
		// TODO Auto-generated method stub
		return chieudai*chieurong;
	}
}