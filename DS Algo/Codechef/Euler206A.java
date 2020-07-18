import java.util.*;
import java.lang.*;
import java.io.*;

public class Euler206A
{
  public static void main(String[] args)
  {
    
    long start=System.nanoTime();
    int[] a=new int[9];
    
    a[0]=1;
    a[8]=7;
    
    String anssquare="";
    String ans="";
    
    boolean found=false;
    
    int l=9;
    for(int x1=0;x1<=l;x1++)
    {
      for(int x2=0;x2<=l;x2++)
      {
        for(int x3=0;x3<=l;x3++)
        {
          for(int x4=0;x4<=l;x4++)
          {
            for(int x5=0;x5<=l;x5++)
            {
              for(int x6=0;x6<=l;x6++)
              {
                for(int x7=0;x7<=l;x7++)
                {
                  a[1]=x1;
                  a[2]=x2;
                  a[3]=x3;
                  a[4]=x4;
                  a[5]=x5;
                  a[6]=x6;
                  a[7]=x7;
                  
                  String s="";
                  
                  for(int i=0;i<9;i++)
                  {
                    s+=(a[i]+"");
                  }
                  long x=Long.parseLong(s);
                  String y=(x*x)+"";
                  if(y.length()==17)
                  {
                    int k=1;
                    boolean flag=true;
                    
//                    System.out.println(x+" "+y);
                    
                    for(int i=0;i<y.length();i+=2)
                    {
                      if(Integer.parseInt(y.substring(i,i+1))!=k)
                      {
                       
                        flag=false;
                        break;
                      }
//                      else
//                      {
//                        System.out.println(y.substring(i,i+1)+" "+k);
//                      }
                      k++;
                    }
                    if(flag)
                    {
                      found=true;
                      ans=x+"";
                      anssquare=y;
                      System.out.println("S");
                      break;
                    }
                  }
                }
                
              }
              if(found)
                break;
            }
            if(found)
              break;
          }
          if(found)
            break;
        }
        if(found)
          break;
      }
      if(found)
        break;
    }
    System.out.println(found);
    System.out.println(ans);
    System.out.println(anssquare);
    
    long end=System.nanoTime();
    System.out.println((end-start)/Math.pow(10,9));
  }
}
  