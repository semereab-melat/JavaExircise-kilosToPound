import java.text.DecimalFormat;

class Main 
{
  public static void main(String[] args) 
  {
    DecimalFormat df = new DecimalFormat("00.0");
    final double POUNDSINKILO = 2.2;
    System.out.println("Kilograms\t\t\tPounds");

    for (int count = 5; count <= 100; count +=5) 
    {
      System.out.println(count + "\t\t\t" + df.format((count * POUNDSINKILO)));
    }
  }//main
}//class
