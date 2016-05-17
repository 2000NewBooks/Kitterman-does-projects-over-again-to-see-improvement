//Project 4

public class Circle extends Shape
{
    // instance variables - replace the example below with your own
    public Point pointC;
    public double r;
    /**
     * Constructor for objects of class Circle
     */
    public Circle(Point c, double radius)
    {
        // initialise instance variables
        this.pointC = c;
        this.r = radius;
    }

    /**

     * @return the center of the circle

     *  
     */
    public Point getCenter(){

        // put your code here
        return this.pointC;
    }
/**
 * @return the radius of the circle
 */
    public double getRadius(){
        return r;
    }
    /**
     * @return the area of the circle
     */
    public double getArea(){
        double area = Math.PI * Math.pow(r,2);
        return area;
    }
    /**
     * returns the perimeter of the circle
     */
    public double getPerimeter(){
    	double perimeter = Math.PI*2*r;
    	return perimeter;
}
}
