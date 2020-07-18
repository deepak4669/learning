import java.lang.*;
import java.io.*;
public class Euler70
{
  public static void main(String[] args)
  {
    double min=Integer.MAX_VALUE;
    int ans=0;
    int n=10000000;
    
    for(int i=2;i<=n;i++)
    {
      int phi=totient(i);
      double val=i/((double)phi);
      if(permutate(i,phi)&&min>val)
      {
//        System.out.println(phi+" "+val);
        min=val;
        ans=i;
      }
    }
    System.out.println(ans);
  }
  public static int totient(int n)
  {
    int result=n;
    for(int i=2;i*i<=n;i++)
    {
      if(n%i==0)
      {
        while(n%i==0)
          n/=i;
        result-=result/i;
      }
    }
    if(n>1)
      result-=result/n;
    return result;
  }
  public static boolean permutate(int n,int m)
  {
    int[] a=new int[10];
    int[] b=new int[10];
    String n_s=n+"";
    String m_s=m+"";
    if(n_s.length()!=m_s.length()) return false;
    for(int i=0;i<n_s.length();i++)
      a[Integer.parseInt(n_s.substring(i,i+1))]++;
    for(int i=0;i<m_s.length();i++)
      b[Integer.parseInt(m_s.substring(i,i+1))]++;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]!=b[i])
        return false;
    }
    return true;
  }
      
      
    
}
