import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a;
        char ch;
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            a=64+i;
            ch= (char) a;
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}