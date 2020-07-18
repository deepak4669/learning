import java.util.*;
import java.io.*;

public class MainLASTDIGIT
{
  static PrintWriter out=new PrintWriter(System.out);
  static long binPow(long x,long y,long n)
  {
    if(y==0)
    {
      if(n==1) return 0;
      else return 1;
    }
    long res=1;
    while(y>0)
    {
      if(y%2!=0)
      {
        res=(res*x)%n;
      }
      x=(x*x)%n;
      y/=2;
    }
    return res;
  }

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      long x=sc.nextLong();
      long y=sc.nextLong();
      out.println(binPow(x,y,10));
      out.flush();}}} 
       
  
  


