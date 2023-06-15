package shapes;

public class Circle extends Shape {
      private double radius;
		 

	public double area() {
		double a=radius*radius*3.14;
		return a;
	}

	@Override
	public double circum() {
		double b=2*3.14*radius;
		return b;
	}

	@Override
	public void print() {
		System.out.println("circle created");
		
	}

	@Override
	public void set() {
		System.out.println("radius is "+radius);
		
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
