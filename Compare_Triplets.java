import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        int brr[]=new int[3];
        int i;
        for(i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            brr[i]=sc.nextInt();
        }
        int al=0,bo=0;
        if(arr[0]>brr[0])
        {
            al++;
        }
        else if(arr[0]<brr[0])
        {
            bo++;
        }
        if(arr[1]>brr[1])
        {
            al++;
        }
        else if(arr[1]<brr[1])
        {
            bo++;
        }
        if(arr[2]>brr[2])
        {
            al++;
        }
        else if(arr[2]<brr[2])
        {
            bo++;
        }
        System.out.println(al+" "+bo);
    }
}