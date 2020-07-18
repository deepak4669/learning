import java.util.*;
import java.io.*;
public class Euler92A
{
  
  public static int square(String s)
  {
    int res=0;
    for(int i=0;i<s.length();i++)
    {
      int j=Integer.parseInt(s.substring(i,i+1));
      res+=j*j;
    }
    return res;
  }
  
  
  public static void main(String[] args)
  {
    int f=10000000;
    int[] a=new int[f+1];
    for(int i=1;i<=f;i++)
    {
      if(a[i]==0)
      {
        int x=i;
        Vector<Integer> pack=new Vector<Integer>();
        pack.add(x);
        while(x!=1&&x!=89)
        {
          String s=x+"";
          x=square(s);
          if(a[x]==1)
            x=1;
          else if(a[x]==2)
           x=89;
          pack.add(x);
          
        }
        if(x==1)
        {
          for(int w:pack)
           a[w]=1;
        }
        else{
         for(int w:pack)
           a[w]=2;
       }
      }
    }
    int count=0;
    for(int i=0;i<=f;i++)
    {
      if(a[i]==2)
        count++;
    }
    System.out.println(count);
   
//    System.out.println(square("9"));
          
    
  }
}