
public class Rectangle implements AreaMeasureable {
	
	static double _length;
	static double _width;
	
	public Rectangle (double length, double width){
		_length = length;
		_width = width;
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double _area = _length*_width;
		return _area;
	}
}
