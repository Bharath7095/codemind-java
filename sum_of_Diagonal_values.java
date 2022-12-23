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
        int i,j,s=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i==j)
                {
                   s+=arr[i][j];
                }
                else if((i+j)==a-1)
                {
                    s+=arr[i][j];
                }
            }
        }
        System.out.println(s);
    }
}