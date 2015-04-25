
public class Sphere implements AreaMeasureable {
	double pi = Math.PI;
	static double _radius;
	public Sphere (double radius){
		_radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double _area = 4*pi*(_radius*_radius);
		return _area;
	}
}
