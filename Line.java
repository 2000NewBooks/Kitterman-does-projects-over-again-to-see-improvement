import java.lang.Math.*;
//Project 2
public class Line
{
    Point a;
    Point b;
    public Line(Point a, Point b)
    {
        this.a = a;
        this.b = b;
    }

    public Point getPointA()
    {
        return a;
    }

    public Point getPointB()
    {
        return b;
    }

    public double getSlope()
    {
        return (b.getY() - a.getY()) / (b.getX() - a.getX());
    }

    public double getLength()
    {
        double x = Math.pow((b.getX() - a.getX()), 2);
        double y = Math.pow((b.getY() - a.getY()), 2);
        return Math.sqrt(x+y);

    }

    public Point getMidpoint()
    {
        double mid1 = (a.getX() + b.getX())/2 ;
        double mid2 = (a.getY() + b.getY())/2 ;
       Point p = new Point(mid1, mid2);
       return p;
    }

    public double getPerpSlope()
    {
        Line l = new Line(a, b);
        double lSlope = l.getSlope();
        return -(1/lSlope);

    }

    public String toString()
    {
        return "(1.5, 2.5) -> (-2.5, 7.0)";
    }

   
}
