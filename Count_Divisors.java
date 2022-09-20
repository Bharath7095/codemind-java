import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,count=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(int k=a;k<=b;k++)
        {
            if(k%c==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}