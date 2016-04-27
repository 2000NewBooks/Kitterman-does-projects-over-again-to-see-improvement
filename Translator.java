import java.io.*;
import java.util.*;
/**
 * A class that takes a Ruby script and translates it into a Java program
 * 
 * @author Carson Sloan and Andrew Kitterman
 */
public class Translator
{
    private static ArrayList<Variable> vars = new ArrayList<Variable>(); //Stores variables to be added as state variables in the translated code
    private static int lineNum = -1; //Stores which line is being read

    /**
     * Constructor for objects of class Translator (Unused)
     */
    public Translator()
    {

    }

    /**
     * Takes the user's Ruby file, then translates it to java and prints it to a new file
     * Runs the program
     * @param args unused
     */
    public static void main(String[] args)
    {   

        Scanner kbReader = new Scanner(System.in);
        System.out.println("Please input the name of the file you would ike to have translated");
        String fileName = kbReader.nextLine();
        System.out.println("Please input the name of the translated file to be output");
        String exportName = kbReader.nextLine();
        File file = null;
        FileWriter writer = null;
        try {
            file = new File(exportName);
            file.createNewFile();
            writer = new FileWriter(file);

        }
        catch (IOException e) {
            System.out.println("oops");
            System.exit(1);
        }

        String line = null; //Used to scan line-by-line
        try
        {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while((line = bufferedReader.readLine()) != null)
            {
                lineNum++; //corrects what line is being read
                writer.write(translate(line) + "\n"); //outputs the new java code to a file
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

        //Variable declarations
        for(Variable var : vars)
        {
            try
            {
                writer.write("public" + var.toString() + ";");
            }
            catch(IOException I)
            {
                System.out.println("oops.");
                System.exit(1);
            }
        }
        try
        {
            writer.flush();
            writer.close();
        }
        catch(IOException I)
        {
            System.out.println("oops.");
            System.exit(1);
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

        /* LOOPS */

        if (line.indexOf("while") != -1)
        {
            newLine += "while ("; //Adds while to the new line
            eqPos = line.trim().indexOf("="); //Finds the index of the equal sign
            Variable var = new Variable(line.substring(line.indexOf("while") + 5, eqPos), "double");
            vars.add(var);
        }
        else if (line.indexOf("do") != -1)
        {
            newLine += "";
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("do") + 2, eqPos), "double");
            vars.add(var);
        }
        else if (line.indexOf("for") != -1)
        {
            newLine += "for (";
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("for") + 3, eqPos), "double");
            vars.add(var);
        }
        else if(line.indexOf("until") != -1 )
        {
            isUntilLoop = true;
            if(isUntilLoop)
            {
                newLine += "do{" + line + "}";//This is still kinda broken.
                eqPos = line.trim().indexOf("="); //Works sorta
                Variable var = new Variable(line.substring(line.indexOf("until") + 5 , eqPos), "double");
                vars.add(var);
            }
        }

        /* CONSOLE */

        else if(line.indexOf("puts") != -1)
        {
            newLine += "System.out.println(//words);";
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("puts") + 4 , eqPos), "String");
            vars.add(var);
        }

        else if(line.indexOf(".chomp") != -1)
        {
            newLine += "Console console = System.console(); String line = console.readLine(//words you want to take input from) ";
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf(".chomp") + 6 , eqPos), "String");
            vars.add(var);
        }

        /* VARIABLES (Unfinished) */

        else if(line.indexOf("Array.new") != -1)
        {
            newLine += "double[] newArr = new double[some number here];";
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("Array.new") + 9 , eqPos), "double");
            vars.add(var);
        }

        else if(line.indexOf("Array.each") != -1)
        {
            newLine += "for(double u; newArr); {/*Some expression here/*}";
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("Array.each") + 10 , eqPos), "double");
            vars.add(var);
        }

        /* OPERATIONS */

        else if(line.indexOf("+") != -1)
        {
            newLine = line + ";";
        }

        else if(line.indexOf("-") != -1)
        {
            newLine = line + ";";
        }

        else if(line.indexOf("/") != -1)
        {
            newLine = line + ";";
        }

        else if(line.indexOf("*") != -1)
        {
            newLine = line + ";";
        }

        else if(line.indexOf("%") != -1)
        {
            newLine = line + ";";
        }
        /* I fixed all the variable assignment 4/25/16 -Andrew */

        else if(line.indexOf("$")!= -1)
        {
            newLine +=  line.substring(line.indexOf("$"),line.indexOf(" ") );
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("$") + 1 , eqPos), "String");
            vars.add(var);
        }
        else if(line.indexOf("@")!= -1)
        {
            newLine +=  line.substring(line.indexOf("@"),line.indexOf(" ") );
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("@") + 1 , eqPos), "String");
            vars.add(var);
        }
        else if(line.indexOf("@@")!= -1)
        {
            newLine +=  line.substring(line.indexOf("@@"),line.indexOf(" ") );
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("@@") + 1 , eqPos), "String");
            vars.add(var);
        }
        else if(line.indexOf("def")!= -1)
        {
            newLine += line.substring(line.indexOf("def"), line.indexOf(" "));
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("def") +1, eqPos), "String");
            vars.add(var);

        }
        else if(line.indexOf("end")!= -1)
        {
            newLine += line.substring(line.indexOf("end"), line.indexOf(" "));
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("end") +1, eqPos), "String");
            vars.add(var);

        }
        else if(line.indexOf("return")!= -1)
        {
            newLine += line.substring(line.indexOf("return"), line.indexOf(" "));
            eqPos = line.trim().indexOf("=");
            Variable var = new Variable(line.substring(line.indexOf("return") +1, eqPos), "String");
            vars.add(var);

        }//so basically we don't want to take the time to translate all this crap
        //so we're going to make sure it can recognize it at least

        else if(line.indexOf("do")!= -1)
        {

        }
        else if(line.indexOf("when")!= -1)
        {

        }
        else if(line.indexOf("new")!= -1)
        {

        }
        else if(line.indexOf("upto")!= -1)
        {

        }
        else if(line.indexOf("# -> []")!= -1)
        {

        }
        else if(line.indexOf("end")!= -1)
        {

        }
        else
        {
            throw new IndexOutOfBoundsException("Unknown argument on line " + lineNum); //If it finds an argument that isn't listed (Obviously, more need to be added)
        }
        return newLine;
    }
}
