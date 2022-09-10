import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int a,b,r,c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(int i=a;i<=b;i++)
            {
                r=i%10;
                if(r==2 || r==3 || r==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}