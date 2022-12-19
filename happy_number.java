import java.util.*;
public class file
{
    public static boolean happy(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            n/=10;
            s+=r*r;
        }
        if(s<10)
        {
            if(s==1 || s==7)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return happy(s);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(happy(n))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}