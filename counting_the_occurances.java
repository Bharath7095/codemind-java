import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a;
        char n;
        int c=0;
        a=sc.nextLine();
        n=sc.nextLine().charAt(0);
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch==n)
            {
                c++;
            }
        }
        if(c!=0)
            System.out.println(c);
        else
            System.out.println("-1");
    }
}