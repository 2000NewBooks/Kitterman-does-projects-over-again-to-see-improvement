//Project 4
public class Polygon extends Shape {
    private Line[] sides;
    public Polygon(Line[] sides){
        this.sides = sides;
    }

    public double getArea(){
        return 2.5;
    }

    public double getPerimeter(){
        double perimeter = 0;
        for (Line side : sides)
        { perimeter = perimeter + side.getLength();
        }
        return perimeter;
    }	

    
}
