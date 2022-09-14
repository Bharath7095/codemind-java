import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int se;
        se=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(se==arr[i])
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}