
package client;

import shapes.Circle;

public class Set {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(45);
		c.print();
		c.set();
		System.out.println("area of circle is "+c.area());
		System.out.println("circum of circle "+c.circum());

	}

}
