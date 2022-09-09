import java.util.*;
public class file
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,count=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            c=sc.nextInt();
            if(c%b==0)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}