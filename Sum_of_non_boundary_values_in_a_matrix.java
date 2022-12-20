import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int arr[][]=new int[a][b];
        int i,j;
        int s=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i==0 || j==0 || i==a-1 || j==b-1)
                {
                    s+=0;
                }
                else
                {
                    s+=arr[i][j];
                }
            }
        }
        System.out.println(s);
    }
}