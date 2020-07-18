import java.util.*;
import java.lang.*;
import java.io.*;
public class Euler6A
{
    static Vector<Integer> triangle;
    static Vector<Integer> square;
    static Vector<Integer> pentagonal;
    static Vector<Integer> hexagonal;
    static Vector<Integer> heptagonal;
    static Vector<Integer> octagonal;

    public static boolean check(int n)
    {
        return 1000<=n&&n<10000;
    }


    public static void main(String[] args)
    {


        triangle=new Vector<Integer>();
        square=new Vector<Integer>();
        pentagonal=new Vector<Integer>();
        hexagonal=new Vector<Integer>();
        heptagonal=new Vector<Integer>();
        octagonal=new Vector<Integer>();
        


        for(int i=1;;i++)
        {
            int number=(i*(i+1))/2;
            if(check(number))
                triangle.add(number);   

            if(number>=10000)
                break;
            number=i*i;
            if(check(number))
                square.add(number);
            number=(i*(3*i-1))/2;
            if(check(number))
                pentagonal.add(number);
            number=(i*(2*i-1));
            if(check(number))
                hexagonal.add(number);
            number=(i*(5*i-3))/2;
            if(check(number))
                heptagonal.add(number);
            number=i*(3*i-2);
            if(check(number))
                octagonal.add(number);

            
        }
        System.out.println("Number of Triangle Numbers between 1000 and 9999 "+triangle.size());
        System.out.println("Number of Square Numbers between 1000 and 9999 "+square.size());
        System.out.println("Number of Pentagonal Numbers between 1000 and 9999 "+pentagonal.size());
        System.out.println("Number of Hexagonal Numbers between 1000 and 9999 "+hexagonal.size());
        System.out.println("Number of Heptagonal Numbers between 1000 and 9999 "+heptagonal.size());
        System.out.println("Number of Triangle Numbers between 1000 and 9999 "+octagonal.size());


        

        // int count=0;
        
        // for(int i=0;i<triangle.size();i++)
        // {
        //     for(int j=0;j<square.size();j++)
        //     {
        //         for(int k=0;k<pentagonal.size();k++)
        //         {
        //             for(int l=0;l<hexagonal.size();l++)
        //             {
        //                 for(int m=0;m<heptagonal.size();m++)
        //                 {
        //                     for(int n=0;n<octagonal.size();n++)
        //                     {
        //                         int[] a=new int[6];
        //                         a[0]=triangle.elementAt(i);
        //                         a[1]=square.elementAt(j);
        //                         a[2]=pentagonal.elementAt(k);
        //                         a[3]=hexagonal.elementAt(l);
        //                         a[4]=heptagonal.elementAt(m);
        //                         a[5]=octagonal.elementAt(n);
        //                         if(!dup(a))
        //                             count++;

        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }
        // System.out.println(count);
    }
    public static boolean dup(int[] a)
    {
        boolean[] marked=new boolean[10000];
        for(int i=0;i<a.length;i++)
        {
            if(marked[a[i]])
                return true;
            else
                marked[a[i]]=true;
        }
        return false;
    }
}