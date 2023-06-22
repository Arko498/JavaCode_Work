import java.util.Scanner;

public class TotalChar
{
    public static void main(String[]args)
{
    Scanner Ob1=new Scanner(System.in);
    System.out.println("enter a word");
    String Word=Ob1.nextLine();
    //TotalChar obj=new TotalChar();
    Calchar(Word);
}
public static void Calchar(String Word) {
    int[] arrCount = new int[256];
    for (int i = 0; i < Word.length(); i++)
    {
        arrCount[Word.charAt(i)]++;
    }
    char[] Ch=new char[Word.length()];
    for(int i=0;i<Word.length();i++)
    {
        Ch[i]=Word.charAt(i);
        int count=0;
        for(int j=0;j<=i;j++)
        {
            if(Word.charAt(i)==Ch[j])
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("total number of "+Word.charAt(i)+" is:"+arrCount[Word.charAt(i)]);
        }
    }
    }
}
