import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,k,r;
        n=sc.nextInt();
        k=n;
        int s=0,b;
        b=n;
        while(b!=0)
        {
            c+=1;
            b/=10;
        }
        for(i=c;i>0;i--)
        {
            r=n%10;
            s+=Math.pow(r,i);
            n/=10;
        }
        if(s==k)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}