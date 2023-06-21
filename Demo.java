import java.util.Scanner;
public class Demo
{
    public  static void main(String[]Args) throws Exception {
       Scanner Sc=new Scanner(System.in);
       System.out.println("enter the day of your choice");
       String Day=Sc.nextLine();

      if(Boolean.TRUE.equals(daychk(Day)))
      {
          System.out.println("its a Working Day");
      }
      else {
          throw new Exception("invalid input");
      }
      Sc.close();
    }
public static Boolean daychk(String DayInp)
{
    String[] DayArr = {"monday", "tuesday", "wednesday", "thursday", "friday"};
    for (String s : DayArr) {
        if (s.equalsIgnoreCase(DayInp))
        {
            return true;
        }
    }return null;
}}



