package MainPackage;

public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	Triangle(){

	}

	Triangle(double side1, double side2, double side3){
		//Creates an instance of Triangle with given side values
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1(){
		return this.side1;
	}

	public double getSide2(){
		return this.side2;
	}

	public double getSide3(){
		return this.side3;
	}

	public double getArea(){
		//Returns the area of the triangle calculated from the side lengths
		double p = (this.side1+this.side2+this.side3)/2;
		return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
	}

	public double getPerimeter(){
		//Returns the perimeter calculated from the sides lengths
		return this.side1 + this.side2 + this.side3;
	}

	public String toString(){
		//Returns a string message describing the parameters of the triangle
		Double s1 = new Double(this.side1);
		Double s2 = new Double(this.side2);
		Double s3 = new Double(this.side3);
		String Description = "Triangle with sides " + s1.toString() + "," + s2.toString() + "," + s3.toString();
		return Description;
	}



}
