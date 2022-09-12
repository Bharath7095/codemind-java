import java.util.*;
public class file{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double a;
        a=Math.sqrt(n);
        if(a==(int)a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}