import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        String s;
        s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i)+"");
        }
    }
}