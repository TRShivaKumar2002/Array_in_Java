

public class diagonal
{
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{1,1,3},{1,2,1}};
        int d=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                {
                  d=d+a[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal is" + d);
    }
}