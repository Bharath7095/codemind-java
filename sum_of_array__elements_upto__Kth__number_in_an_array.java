import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int sum=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]<=a)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}