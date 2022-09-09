import java.util.*;
import java.lang.*;
public class file
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.nextLine().charAt(0);
        if(a=='A' || a=='E' || a=='O' || a=='I' || a=='U' || a=='a' || a=='e' || a=='o' || a=='i' || a=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}