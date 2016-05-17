
/**
 * Write a description of class Editor2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Editor2 implements Ed
{
    // instance variables - replace the example below with your own
    private String text;
    private int pos;
    /**
     * Constructor for objects of class Editor2
     */
    public Editor2( String text, int pos)
    {
        this.text = text;
        this.pos = pos;
    }

    public Editor2(){
        this.text = "";
        pos = 0;
    }

    public Ed insertString( String c) {
        text = getFirst() + c + getRest();
        pos = pos + 1;
        return new Editor2(text, pos);
    }

    /**
     * Returns the first string in the sequence
     */
    public String getFirst() { 
        String first = text.substring(0, pos);
        return first;
    }

    /**
     * Returns the second string in the sequence
     */
    public String getRest() {
        String rest = text.substring(pos, text.length());
        return rest;
    }

    public Ed rightArrow(){
        if (getRest().length() !=0)
        {
            pos = pos+1;
            return new Editor2(text, pos);
        }
        else {
            return new Editor2(text, pos);
        }
    }

    public Ed leftArrow(){
        if(getFirst().length()!=0)
        {
            pos = pos - 1;
            return new Editor2(text, pos);
        }
        else
        {
            return new Editor2(text, pos);
        }
    }

    public Ed delete(){
        if (getRest().length() !=0){
            text = getFirst() + getRest().substring(1, getRest().length());
            return new Editor2(text, pos);
            
        }
        else 
        {
            return new Editor2(text, pos);
        }
    }


    public Ed backspace(){
        if(getFirst().length() !=0) {
            text = getFirst().substring(0, pos-1) + getRest();
            pos = pos-1;
            return new Editor2(text, pos);
        }
        else 
        {
            return new Editor2(text, pos);
        }

    }

    public Ed endKey(){
        pos = text.length();
        return new Editor2(text, pos);

    }

    public Ed homeKey(){
        pos = 0;
        return new Editor2(text, pos);
    }
    
    public String toString()
    {
        return "hi|there";
    }
}
