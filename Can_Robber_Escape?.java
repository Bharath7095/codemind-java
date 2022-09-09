import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a,c=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a%2!=0)
            {
                c+=1;
            }
        }
        if(c>=3)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}