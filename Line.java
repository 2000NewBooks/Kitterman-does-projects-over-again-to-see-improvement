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
  public double getMidpoint()
  {
    
  }
  public double getPerpSlope(
    {
      
    )
    public String toString()
    {
      
    }
    public Line getPerpBisector()
    {
      
    }
}
