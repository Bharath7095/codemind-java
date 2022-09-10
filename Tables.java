import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,n;
        a=sc.nextInt();
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+" x "+i+" = "+a*i);
            i++;
        }
    }
}