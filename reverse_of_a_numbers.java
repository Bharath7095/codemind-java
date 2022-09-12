import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,a,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n;
        while(a!=0)
        {
            r=a%10;
            a/=10;
            s=s*10+r;
        }
        System.out.println(s);
    }
}