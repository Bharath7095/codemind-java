import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}