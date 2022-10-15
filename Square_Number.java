import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        double a=Math.sqrt(n);
        if(a==(int)a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}