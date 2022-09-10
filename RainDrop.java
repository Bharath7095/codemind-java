import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        if(n%3==0)
        {
            System.out.print("Pling"+"");
            c+=1;
        }
        if(n%5==0)
        {
            System.out.print("Plang"+"");
            c+=1;
        }
        if(n%7==0)
        {
            System.out.print("Plong");
            c+=1;
        }
        if(c==0)
        {
            System.out.println(n);
        }
    }
}