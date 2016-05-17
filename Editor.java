/**
 *@Author 
 *This is an implementation of an editor.
 */

public class Editor implements Ed
{
    /*
     *  The first string in the sequence, possible an empty string.
     */
    private String first;
    /*
     *  The second string in the sequence, possible an empty string.
     */
    private String rest;
    /**
     * Initializes the Editor with an empty body.
     */
    public Editor() 
    {
        first = "";
        rest = "";
    }

    public Editor( String beginning, String end ) 
    {
        first = beginning;
        rest = end;
    }

    /**
     * Returns the first string in the sequence
     */
    public String getFirst() { return first; }

    /**
     * Returns the second string in the sequence
     */
    public String getRest() { return rest; }

    /**
     * Returns an Editor representing the current editor after pressing the right arrow
     */
    public Ed rightArrow() 
    {
        if (rest.length()!=0){
            first = first + rest.substring(0,1);
            rest = rest.substring(1,rest.length());
            return new Editor(first, rest);
        }

        else
        {
            return new Editor(first, rest);
        }

        
    }

    /**
     * Returns an Editor representing the current editor after pressing the right arrow
     */
    public Ed leftArrow() 
    {
        if (first.length()!=0){
            rest = first.substring(first.length()-1, first.length())+rest;
            first = first.substring(0,first.length()-1);
            return new Editor(first, rest);
        }

        else
        {
            return new Editor(first, rest);
        }
    }

    /**
     * Returns an Editor representing the current editor after pressing backspace
     */
    public Ed backspace() 
    {
        if (first.length()!=0){
            
            first = first.substring(0,first.length()-1);
            return new Editor(first, rest);
        }

        else
        {
            return new Editor(first, rest);
        }
    }

    /**
     * Returns an Editor representing the current editor after pressing delete
     */
    public Ed delete() 
    {
        if (rest.length()!=0){
            
            rest = rest.substring(1,rest.length());
            return new Editor(first, rest);
        }

        else
        {
            return new Editor(first, rest);
        }
    }

    /**
     * Returns an Editor representing the current editor after inserting a character
     * @param c The character to insert
     */
    public Ed insertString(String c)
    {
        return new Editor( first+c,rest );
    }

    /**
     * Returns an Editor representing the current editor after pressing the home key
     */
    public Ed homeKey() 
    {
        rest = first + rest;
        first = "";
        return new Editor (first, rest);
    }

    /**
     * Returns an Editor representing the current editor after pressing the end key
     */
    public Ed endKey()
    {
        first = first+rest;
        rest = "";
        return new Editor (first, rest);
    }

    /**
     * Returns the Editor as a string in form "&lt;first&gt;|&lt;rest&gt;"
     */
    public String toString() { return first + "|" + rest; }

    public static void main( String [] args )
    {
        Ed bothSides = new Editor( "big", "dog" );	
        Ed rightSide = new Editor( "", "dog" );
        Ed leftSide = new Editor( "big", "" );
        Ed neitherSide = new Editor( "", "" );
        System.out.println( bothSides + "   after rightArrow   " + bothSides.rightArrow() );
        System.out.println( rightSide + "   after rightArrow   " + rightSide.rightArrow() );
        System.out.println( leftSide + "   after rightArrow   " + leftSide.rightArrow()  );
        System.out.println( neitherSide + "   after rightArrow   " + neitherSide.rightArrow()  );
    }
}
