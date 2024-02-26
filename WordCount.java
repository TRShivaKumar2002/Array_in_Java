import java.util.Scanner;
import java.io.*;

public class WordCount
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String k=s.nextLine();
         
        int count=1;
        for(int i=0;i<k.length();i++)
        {
            if((k.charAt(i)==' ')&&(k.charAt(i+1)!=' '))
            {
                count++;

            }
        }
System.out.println("The Total Number Of words is"+count);
    }
}