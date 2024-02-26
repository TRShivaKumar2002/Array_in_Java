

class MatrixAddition{
    public static void main(String args[])
    {
        int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] b=new int[][]{{10,11,12},{13,14,15},{16,17,18}};
        int[][] c=new int[3][3];
        int d=0;

        if(a.length==b.length && a[0].length==b[0].length)
        {
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
        }
        else
        {
          System.out.println("Matrix A and B are not Same");
        }
        System.out.println("The Matrix A is");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]+"");
            }
            System.out.println("");

        }
        System.out.println("The Matrix B is");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.println(b[i][j]+"");
            }
            System.out.println("");

        }
        System.out.println("The Addition of Matrix A and Matrix B is");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                System.out.println(c[i][j]+"");
            }
            System.out.println("");

        }

        System.out.println("The  Resultant Matrix is");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(c[i][j]!=0)
                {
                    d=1;
                    break;
                }
            }
            System.out.println("");

        }
        if(d==0)
        {
            System.out.println("The Given Matrix is a Null Matrix");
        }
        else
        {
            System.out.println("The Given Matrix is not a Null Matrix");
        }
    }
}