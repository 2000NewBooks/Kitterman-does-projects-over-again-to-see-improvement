
/**
 * Write a description of class Triangle here.
 * 
 * @author John Chen and Andrew K
 * @version (a version number or a date)
 */
public class Triangle
{
    public Point pointA;
    public Point pointB;
    public Point pointC;
    public Point pointD;
    public double length1;
    public double length2;
    public double length3;
    public double sides;
    public double perimeter;
    public double yes;
    public double xA;
    public double xB;
    public double yA;
    public double yB;
    public double xC;
    public double yC;
    public double area;
    public Point center;
    public Line getAltitude;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(Point a, Point b, Point c)
    {
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;
        /*this.sides = this.getSides();
        this.perimeter = this.getPerimeter();
        this.area = this.getArea;
        this.center = this.Center();*/

    }

    /**
     * @return the first point
     */
    public Point getPointA() {
        return this.pointA;
    }

    /**
     * @return the second point
     */
    public Point getPointB() {
        return this.pointB;
    }

    /**
     * @returns the third point
     */
    public Point getPointC() {
        return this.pointC;
    }

    /**
     * @return the sides in an array 
     */
    public  Line[] getSides(){
        xA = this.pointA.getX();
        xB = this.pointB.getX();
        yA = this.pointA.getY();
        yB = this.pointB.getY();
        xC = this.pointC.getX();
        yC = this.pointC.getY();

        Line[] getSides = new Line[3];
        getSides[0] = new Line (pointA, pointB);
        getSides[1] = new Line (pointA, pointC);
        getSides[2] = new Line (pointB, pointC);

        return getSides;
    }

    /**
     * @return the perimeter of the triangle
     */
    public double getPerimeter() {
        xA = this.pointA.getX();
        xB = this.pointB.getX();
        yA = this.pointA.getY();
        yB = this.pointB.getY();
        xC = this.pointC.getX();
        yC = this.pointC.getY();
        double length1 = Math.sqrt(((xA - xB) * (xA - xB)) + ((yA - yB) * (yA - yB)));
        double length2 = Math.sqrt(((xB - xC) * (xB - xC)) + ((yB - yC) * (yB - yC)));
        double length3 = Math.sqrt(((xA - xC) * (xA - xC)) + ((yA - yC) * (yA - yC)));
        this.perimeter = length1+length2+length3;
        return perimeter;

    }

    /**
     * @return the center of the triangle
     */
    public Point getCenter(){
        xA = this.pointA.getX();
        xB = this.pointB.getX();
        yA = this.pointA.getY();
        yB = this.pointB.getY();
        xC = this.pointC.getX();
        yC = this.pointC.getY();
        double centerX = ((xA+xB+xC)/3);
        double centerY = ((yA+yB+yC)/3);
        Point center = new Point (centerX, centerY);
        return center;
    }

    /**
     * @return the points in  a string
     */
    public String toString(){
        xA = this.pointA.getX();
        xB = this.pointB.getX();
        yA = this.pointA.getY();
        yB = this.pointB.getY();
        xC = this.pointC.getX();
        yC = this.pointC.getY();
        return "(" + xA + "," + yA + ")" + "->" + "(" + xB + "," + yB + ")" +"->" + "(" + xC + "," + yC +")";
    }

    /** 
     * @return the area of the triangle
     */
    public double getArea(){
        xA = this.pointA.getX();
        xB = this.pointB.getX();
        yA = this.pointA.getY();
        yB = this.pointB.getY();
        xC = this.pointC.getX();
        yC = this.pointC.getY();
        double length1 = Math.sqrt(((xA - xB) * (xA - xB)) + ((yA - yB) * (yA - yB)));
        double length2 = Math.sqrt(((xB - xC) * (xB - xC)) + ((yB - yC) * (yB - yC)));
        double length3 = Math.sqrt(((xA - xC) * (xA - xC)) + ((yA - yC) * (yA - yC)));
        this.perimeter = length1+length2+length3;
        yes = perimeter/2;
        this.area = Math.sqrt(yes*(yes-length1)*(yes-length2)*(yes-length3));
        return area;
    }

    public Line getAltitude(){
        return new Line(pointA, pointB);
    }

}
