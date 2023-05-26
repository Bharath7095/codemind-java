import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n<=100 && n>=3){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n-1;i>0;i--){
                for(int j=0;j<i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The pattern is not possible");
        }
    }
}