import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=1;
        int num=sc.nextInt();
        while(n<num)
        {
            n*=2;
        }
        int a=n/2;
        if(a-num<num-n)
        {
            System.out.println(n-num);
        }
        else
        {
            System.out.println(num-a);
        }
    }
}