import java.util.*;
import java.io.*;

public class Euler79A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String[] s=new String[50];
    int[] a=new int[10];
    int digits=0;
    String ans="";
    Vector<Integer> first=new Vector<Integer>();
    Vector<Integer> second=new Vector<Integer>();
    Vector<Integer> third=new Vector<Integer>();
    for(int i=0;i<50;i++)
    {
      s[i]=sc.next();
      for(int j=0;j<3;j++)
      {
        int x=Integer.parseInt(s[i].substring(j,j+1));
        a[x]++;
        if(j==0)
        {
          if(!first.contains(x))
            first.add(x);
        }
        else if(j==1)
        {
          if(!second.contains(x))
            second.add(x);
        }
        else if(j==2)
        {
          if(!third.contains(x))
            
            third.add(x);
        }
      }
    }
    for(int i=0;i<10;i++)
    {
      if(a[i]>0)
      {
        digits++;
        ans=ans+""+i;
      }
    }
    
    
    System.out.println(ans);
    System.out.println(digits);
    System.out.println("First");
    for(int w : first)
      System.out.println(w);
    System.out.println("Second");
    for(int w: second)
      System.out.println(w);
    System.out.println("Third");
    for(int w:third)
      System.out.println(w);
    
    for(int i=0;i<50;i++)
    {
      if(s[i].charAt(0)=='2')
        System.out.println(s[i].charAt(1)+" "+s[i].charAt(2));
    }
    
    
    
    
  }
}
      
    