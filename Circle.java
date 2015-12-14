public class Circle extends Shape implements Area{

    private double radius;

    public double getArea(){
	return Math.PI * Math.pow(getRadius(),2);
    }
    public Circle(double radius, String name){
	super(name);
	this.radius = radius;
    }

    public double getRadius(){
	return radius;
    }

    public String toString(){
	return "Circle "+getName()+" with radius of "+getRadius();
    }

}