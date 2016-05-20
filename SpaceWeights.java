import java.util.*;

public class SpaceWeights
{
    // instance variables - replace the example below with your own
    private static double mass;
    private boolean runtime;
    public SpaceWeights()
    {

    }

    public  void main(String[] args ) {
        while( runtime = true)
        {
            Scanner input = new Scanner(System.in); 

            System.out.print("Please enter your mass or “exit” to quit:") ; 
            String h = input.next();
            

            double weight = Double.parseDouble(h); 

            System.out.print("Please enter the name of a planet or arbitrary to make your own"); 
            String xw = input.next().toLowerCase();
            switch(xw)
            {

                case "mercury":
                System.out.println("Your weight on mercury is " + weight * 3.7);
                break; 
                case "venus":
                System.out.println("Your weight on venus is " + weight * 8.87);
                break;
                case "earth":
                System.out.println("Your weight on earth is " + weight * 9.81);
                break;
                case "mars":
                System.out.println("Your weight on mars is " + weight * 3.71);
                break;
                case "jupiter":
                System.out.println("Your weight on jupiter is " + weight * 23.12);
                break;
                case "saturn":
                System.out.println("Your weight on saturn is " + weight * 10.44);
                break;
                case "uranus":
                System.out.println("Your weight on uranus is " + weight * 8.69);
                break;
                case "neptune":
                System.out.println("Your weight on neptune is " + weight * 11);
                case "arbitrary":
                System.out.println("please enter the radius of this planet");
                String x = input.next();
                double rads = Double.parseDouble(x);
                System.out.println("please enter the mass of the planet");
                String z = input.next();
                double m = Double.parseDouble(z);
                System.out.println("your mass on this planet would be" + weight * m * 6.67E-11 / Math.pow(rads, 2));
                break;
                
            }

            break;
        }

    }

    public static double mercuryWeight(double mass)
    {
        mass = mass * 3.7;
        return mass;
    }

    public static double venusWeight(double mass)
    {
        mass = mass * 8.87;
        return mass;
    }

    public static double earthWeight(double mass)
    {
        mass = mass * 9.81;
        return mass;
    }

    public static double marsWeight(double mass)
    {
        mass = mass * 3.71;
        return mass;
    }

    public static double jupiterWeight(double mass)
    {
        mass = mass * 23.12;
        return mass;
    }

    public static double saturnWeight(double mass)
    {
        mass = mass * 10.44;
        return mass;
    }

    public static double uranusWeight(double mass)
    {
        mass = mass * 8.69;
        return mass;
    }

    public static double neptuneWeight(double mass)
    {
        mass = mass * 11;
        return mass;
    }

    public static double arbitraryPlanetWeight(double massPerson, double massPlanet, double radiusPlanet)    
    {

        massPerson = massPerson * massPlanet * 6.67E-11 / Math.pow(radiusPlanet, 2);
        return mass;
    }
}

