import java.util.*;
public class file{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            c=b;
            b=a;
            a=c;
        }
        c=b;
        while(c!=0)
        {
            if(a%c==0 && b%c==0)
            {
                System.out.println(c);
                break;
            }
            c-=1;
        }
    }
}