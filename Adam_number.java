import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,a,rev=0,sq,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        a=n;
        while(a!=0)
        {
            r=a%10;
            a/=10;
            rev=rev*10+r;
        }
        a=rev*rev;
        b=a;
        int reve=0;
        while(a!=0)
        {
            r=a%10;
            a/=10;
            reve=reve*10+r;
        }
        if(reve==sq)
        {
            System.out.println("True");   
        }
        else
        {
            System.out.println("False");
        }
    }
}