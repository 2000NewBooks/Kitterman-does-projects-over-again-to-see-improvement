
/**
 * Stores the name and type of a Ruby variable to be translated
 * 
 * @author Carson Sloan and Andrew Kitterman
 */
public class Variable
{
    private String name;
    private String type;
    
    /**
     * Constructor for objects of class Variables
     */
    public Variable(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    
    /**
     * Returns the name of the variable (e.g. "ary")
     * @return the name of the variable (e.g. "ary")
     */
    public String returnName()
    {
        return name;
    }
    
    /**
     * Returns the type of the variable (e.g. "int")
     * @return the type of the variable (e.g. "int")
     */
    public String returnType()
    {
        return type;
    }
}
