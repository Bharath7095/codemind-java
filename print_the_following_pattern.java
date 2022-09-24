import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        int i,j;
        k=n;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.print("x"+"");
                    if(i==k)
                    {
                        k--;
                    }
                }
                else if(k==j)
                {
                    System.out.print("x"+"");
                    k--;
                }
                else
                {
                    System.out.print("0"+"");
                }
            }
            System.out.println();
        }
    }
}