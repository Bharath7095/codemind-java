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
        int j=n-1;
        for(i=0;i<n/2;i++)
        {
            System.out.print(arr[i]+" "+arr[j]+" ");
            j--;
        }
        if(n%2!=0)
        {
            System.out.print(arr[n/2]+" ");
            System.out.print("0");
        }
    }
}