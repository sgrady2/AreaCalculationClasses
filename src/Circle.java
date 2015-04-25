
public class Circle implements AreaMeasureable {
	double pi = Math.PI;
	static double _radius;
	public Circle (double radius){
		_radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double _area = pi*(_radius*_radius);
		return _area;
	}
}
