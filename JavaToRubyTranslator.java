import java.util.*;
public class JavaToRubyTranslator
{

    public JavaToRubyTranslator()
    {
        
    }

    public void LoopRecognize()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input the name of a loop or statement in Ruby.");
        String getLoopOrStatement = console.next();
        switch(getLoopOrStatement)
        {
            case "while":
            whileLoop();
            break;
            case"until":
            untilLoop();
            break;
            case "for":
            forLoop();
            break;
            case "break":
            breakStatement();
            break;
            case "retry":
            retryStatement();
            break;
            case "redo":
            redoStatement();
            break;
            case "next":
            nextStatement();
            break;
            default:
            System.out.println("Not a loop or statement I coded.");
            break;
        }
    }

    public void whileLoop()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the letter of the variable you are going to use.");
        String varString = kb.next();
        System.out.println("Please input the first line of your loop, using proper syntax.");
        String firstLine = kb.next();
        if(firstLine.equals("while $" + varString + " < $num do"))
        {
            System.out.println("You have passed the first stage of the test.");
            System.out.println("Please enter the second line of your code.");
            String secondLine = kb.next();
            if(secondLine.contains("puts"))
            {
                System.out.println("You know it!");
                System.out.println("Please enter the third and final line of your code.");
                String thirdLine = kb.next();
                if(thirdLine.contains("$" + varString))
                {
                    System.out.println("Alright.");
                    System.out.println("Here is the code you will write in your java compiler.");
                    System.out.println("while(i < num){" + "\n" + "System.out.println(''Thing you want to do with varString'')" + "\n" + varString + "++" + "\n" + "}");  

                }
                else
                {
                    System.out.println("Nop.");
                    return;

                }
            }
            else
            {
                System.out.println("Nop.");
                return;
            }
        }
        else
        {
            System.out.println("Nop.");
            return;
        }
    }

    public void untilLoop()
    {
        System.out.println("do { //code here} while(//some condition).");
        
        
    }

    public void forLoop()
    {
        System.out.println("for(int i = 0; i < //how many times you want it to run, or a variable with an assigned value.; i++) {//code here that runs multiple times}.");
    }   

    public void breakStatement()
    {
        System.out.println("Type break; anywhere in a loop to break out of it.");
        System.out.println("Really. That's it. Anywhere. Except in the constructor.");
    }

    public void nextStatement()
    {
        System.out.println("This has some confusing syntax.");
        System.out.println("Whenever something (not a loop, an if statement) can break your code");
        System.out.println("Write: if(code here)contine;");
        System.out.println("It's mainly used in if statements that deal with booleans. It stops the boolean from ending the code.");
    }

    public void redoStatement()
    {
        System.out.println("There is a certain set of skills to hunt down and kill the redo statement.");
        System.out.println("Basically it's a for loop unless you want a certain statement redone.");
        
    }

    public void retryStatement()
    {
        System.out.println("try() { ");
        System.out.println("//code here that needs to run more than once");
        System.out.println("catch {//some exception}");
        
    }

}
