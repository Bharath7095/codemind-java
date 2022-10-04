import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a;
        int c=0;
        a=sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch==' ')
            {
                c++;
            }
        }
        System.out.println(c+1);
    }
}