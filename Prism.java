public class Prism extends Rectangle implements Volume{

    private double height;
    public double getVolume(){
	return height*getArea();
    }
    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "FIXME!";
    }
}