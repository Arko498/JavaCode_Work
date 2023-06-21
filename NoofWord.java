import java.sql.SQLOutput;
import java.util.Scanner;

public class NoofWord
{
    public static void main(String[]Args)
    {
        Scanner S=new Scanner(System.in);
        String Wrd=S.nextLine();
        int Count=0;
        for(int i=0;i<Wrd.length();i++)
        {
            if(Wrd.charAt(i)!=' ')
            {
                Count++;
            }
        }
        System.out.println("total words in the word "+Wrd+" is:"+Count);
        S.close();

    }

}
