public class Project1
{
  int i;
  String str;
  boolean b;
  /**
   * non-default constructor
   * Initializes all state variables
   */
  public Project1()
  {
    i = 5;
    str = "Hello World!";
    b = false;
  }
  /**
   *This sets the integer i to whatever
   * you want it to be
   */
  public void setI(int x)
  {
    i = x;
  }
  /**
   *returns the String we initialized.
   * Should return Hello World!
   */
  public String getString()
  {
    return str;
  }
  /**
   * Gets the b value. 
   * Should return false.
   */
  public boolean getB()
  {
    return b;
  }
}
