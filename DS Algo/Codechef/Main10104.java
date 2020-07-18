import java.util.*;
import java.io.*;

public class Main10104
{
  static PrintWriter out=new PrintWriter(System.out);
  static int[] gcd(int a,int b)
  {
    int[] res=new int[3];
    if(b==0)
    {
      res[0]=1;
      res[1]=0;
      res[2]=a;
      return res;
    }
    int[] prev=gcd(b,a%b);
    res[2]=prev[2];
    res[0]=prev[1];
    res[1]=prev[0]-(a/b)*prev[1];
    return res;
  }
      
      
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext())
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int[] sol=gcd(a,b);
      out.println(sol[0]+" "+sol[1]+" "+sol[2]);
      out.flush();
    }
    
    
    
    
    
  }
  
}

