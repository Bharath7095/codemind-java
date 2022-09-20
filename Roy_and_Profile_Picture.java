import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,l;
        l=sc.nextInt();
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if(a<l || b<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(a==b)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
    }
}