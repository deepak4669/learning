import java.util.*;
import java.io.*;
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(f(x));
    }
    public static int f(int num)
    {
        int x=0;
        while(num!=0)
        {
            x+=(num%10);
            num/=10;
            if(num==0&&x>=10)
            {
                num=x;
                x=0;
            }
        }
        return x;

    }
}