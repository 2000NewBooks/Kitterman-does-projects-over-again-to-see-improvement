
/**
 * Write a description of class Translator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PigLatinTranslator implements TranslatorInterface
{
    // instance variables - replace the example below with your own
    private int i;
    private String str;
    private String first;
    private boolean vowel;
    /**
     * Constructor for objects of class Translator
     */
    public PigLatinTranslator()
    {

    }

    /**
     * @Checks to see if the first letter of the inputted word      
     */
    public boolean isVowel(String str){
        str = str.toLowerCase();
        if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u' || str.charAt(0) == 'y') {
            vowel = true;
        }
        else {
            vowel = false;
        }
        return vowel;
    } 
/**
 * Translates English to Pig latin
 */
    public String translateE2P (String str) {

        if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u' || str.charAt(0) == 'y') 
        {
            str = str + "way";
            return str.toLowerCase();
        }

        for ( int i = 0; i <= str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                first = str.substring(0,i);
                str = str.substring(i, str.length()) + first + "ay";
                return str.toLowerCase();
            }  
        }
        return str.toLowerCase();
    }
/**
 * Returns original string
 */
    public String translateP2E (String str) {
        return "rest";
    }
}

