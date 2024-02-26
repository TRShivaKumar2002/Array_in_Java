
import java.util.*;

public class Sb{
    public static void main(String[] args)
    {
        String s="apple";

        StringBuilder sb=new StringBuilder();
        s.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);


char[] a=s.toCharArray();
StringBuilder sb1=new StringBuilder();

 
        for(int i=0;i<a.length;i++)
        {
            boolean b=false;

            for(int j=i+1;j<a.length;j++)
            {

                if(a[i]==a[j])
                {
                    b=true;
                    break;   }

            }
            if(!b)
            {
                sb1.append(a[i]);
            }
        }

        System.out.println(sb1);
    } 
}