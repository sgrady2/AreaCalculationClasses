import java.util.Random;
import java.lang.Double;
import java.util.ArrayList;
public class MainMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AreaMeasureable> list = new ArrayList<AreaMeasureable>(1000);
		calculateSum(list);
		//adding variables to count the number of times each class is used
		int countCircles = 0;
		int countSpheres = 0;
		int countSquares = 0;
		int countRects = 0;
		int countBoxes = 0;
		int countCubes = 0;
		//i could also count as the class is constructed like we were shown in class but I went with a more simple (but more code) 
		//way of doing things to count my instances of each shape
		for (int i = 0; i <1000;i++){
			double testing = nextRandomDouble();
			if (testing <= (.1666)){
				Circle circ = new Circle(nextRandomDouble());
				list.add(circ);
				countCircles++;
			}else if (testing <= .3333){
				Sphere sph = new Sphere(nextRandomDouble());
				list.add(sph);
				countSpheres++;
			}else if (testing <= .5){
				double square_Side = nextRandomDouble();//squares have sides of all equal length
				Square sq = new Square(square_Side, square_Side);
				list.add(sq);
				countSquares++;
			}else if (testing <= .666){
				Rectangle rect = new Rectangle(nextRandomDouble(), nextRandomDouble());
				list.add(rect);
				countRects++;
			}else if (testing <= .8333){
				Box bx = new Box(nextRandomDouble(), nextRandomDouble(), nextRandomDouble());
				list.add(bx);
				countBoxes++;
			}else if (testing <= 1){
				double cube_Side = nextRandomDouble();//all sides of a cube are the same, so random inputs for each would be nonsense
				Cube cb = new Cube(cube_Side,cube_Side,cube_Side);
				list.add(cb);
				countCubes++;
			}
			
		}
		System.out.println("Circles: "+countCircles+"Spheres: "+countSpheres+"Squares:"+countSquares+"Rectangles:"+countRects+"Boxes: "+countBoxes+"Cubes: "+countCubes);
		System.out.println("Sum:"+calculateSum(list));
	}
	private static double nextRandomDouble(){
		double random = new Random().nextDouble()+.01*1;//setting the range from (0-1], so excluding 0 by adding a minimum value
		return(random);
	}

	private static double calculateSum(ArrayList<AreaMeasureable> sumList){
		AreaMeasureable sum;
		double sumTotal = 0;
		for (int i = 0;i < sumList.size();i++){
			sum = sumList.get(i);
			sumTotal += sum.getArea();
		}
		return sumTotal;
	}
}
