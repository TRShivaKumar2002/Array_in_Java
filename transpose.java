
import java.util.Scanner;
import java.io.*;
public class transpose
{
    public static void main(String[] args)
    {
//Scanner s=new Scanner(System.in);
int a[][]={{1,1,1},{2,2,2},{3,3,3}};
            int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                
                a[i][j]=a[j][i];
                a[j][i]=temp;
                

                System.out.println("After transpose"+temp);

            }

        }
    }
}