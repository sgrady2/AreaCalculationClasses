
public class Box implements AreaMeasureable {
	
	protected double _length;
	protected double _width;
	protected double _height;
	
	public Box (double length, double width, double height){
		_length = length;
		_width = width;
		_height = height;
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double _area = 2*((_length*_width)+(_width*_height)*(_height*_length));
		return _area;
	}
}
