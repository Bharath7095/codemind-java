import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        char ch;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            ch=(char)(64+i);
            for(int j=1;j<=n;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}