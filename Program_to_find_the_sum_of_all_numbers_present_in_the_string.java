import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            int x=((int)s.charAt(i))-48;
            if(x>0 && x<=9)
            {
                c+=x;
            }
        }
        System.out.println(c);
    }
}