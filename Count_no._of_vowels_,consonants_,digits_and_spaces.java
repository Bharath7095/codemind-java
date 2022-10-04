import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a;
        int c=0,v=0,d=0,s=0;
        a=sc.nextLine();
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(Character.isDigit(ch))
            {
                d++;
            }
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                v++;
            }
            else if(ch==' ')
            {
                s++;
            }
            else
            {
                c++;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+s);
    }
}