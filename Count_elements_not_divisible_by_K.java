import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int arr[]=new int[a];
        int i;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%b!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}