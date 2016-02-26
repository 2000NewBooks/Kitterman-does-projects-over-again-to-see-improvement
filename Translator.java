import java.io.*;
import java.util.*;
/**
 * A class that takes a Ruby script and translates it into a Java program
 * 
 * @author Carson Sloan and Andrew Kitterman
 */
public class Translator
{
    private Variable[] vars = new Variable[100]; //Stores variables to be added as state variables in the translated code
    private static int lineNum = -1; //Stores which line is being read

    /**
     * Constructor for objects of class Translator (Unused)
     */
    public Translator()
    {

    }
    
    /**
     * Runs the program
     */
    public static void main(String args)
    {   
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Please input the name of the file you would ike to have translated");
        String fileName = kbReader.nextLine();
        String line = null; //Used to scan line-by-line
        try
        {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while((line = bufferedReader.readLine()) != null)
            {
                lineNum++; //corrects what line is being read
                System.out.println(translate(line)); //outputs the new java code line-by-line, this should be changed
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex)
        {
            ex.printStackTrace(); //For other errors
        }
    }
    
    /**
     * Almost Done
     * Returns a java version of an inputted line of Ruby code
     * @return a java version of an inputted line of Ruby code
     */
    public static String translate(String line)
    {
        int eqPos = -1; //Stores the position of the equal sign so the variables can be separated
        String newLine = ""; //Translated line
        boolean isUntilLoop = false;
        if (line.indexOf("while") != -1)
        {
            newLine += "while ("; //Adds while to the new line
            eqPos = line.trim().indexOf("="); //Finds the index of the equal sign
            String var = line.substring(line.indexOf("while") + 5, eqPos);
        }
        else if (line.indexOf("do") != -1)
        {
            newLine += "";
            eqPos = line.trim().indexOf("=");
            String var = line.substring(line.indexOf("do") + 2, eqPos);
        }
        else if (line.indexOf("for") != -1)
        {
            newLine += "for (";
            eqPos = line.trim().indexOf("=");
            String var = line.substring(line.indexOf("for") + 3, eqPos);
        }
        else if(line.indexOf("until") != -1 )
        {
            isUntilLoop = true;
            if(isUntilLoop)
            {
                newLine += "do{" + line + "}";//This is still kinda broken.
                eqPos = line.trim().indexOf("="); //Works sorta
                String var = line.substring(line.indexOf("until") + 5 , eqPos);
            }
        }

        else
        {
            throw new IndexOutOfBoundsException("Unknown argument on line " + lineNum); //If it finds an argument that isn't listed (Obviously, more need to be added)
        }
        return newLine;
    }
}
