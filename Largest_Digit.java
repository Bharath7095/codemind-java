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
            if(r>s)
            {
                s=r;
            }
        }
        System.out.println(s);
    }
}