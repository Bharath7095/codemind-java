import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r,e=0,o=0;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            n/=10;
            if(r%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
        }
        if(e==0 && o!=0)
        {
            System.out.println("Odd");
        }
        else if(e!=0 && o==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}