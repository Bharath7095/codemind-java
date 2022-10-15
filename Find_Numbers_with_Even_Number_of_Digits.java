import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            int a=arr[i],r,c=0;
            while(a!=0)
            {
                a/=10;
                c++;
            }
            if(c%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
}