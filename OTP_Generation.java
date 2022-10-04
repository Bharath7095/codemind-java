import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;
        String s;
        s=sc.nextLine();
        int rev=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int n=(((int)ch)-48);
            if(n%2!=0)
            {
                n=n*n;
                System.out.print(n+"");
            }
        }
    }
}