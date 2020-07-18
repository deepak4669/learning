import java.util.Scanner;
import java.util.*;
import java.io.*;
public class TDPRIMES
{
  static int n=100000000;
  static boolean[] prime=new boolean[n+1];
  static Vector<Integer> p=new Vector<Integer>();
  static int index=0;
  static int[] primes=new int[10000001];
  static PrintWriter out=new PrintWriter(System.out);
  public static void preprocess()
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    int m=(int)Math.sqrt(n);
    for(long i=2;i<=n;i++)
    {
      if(prime[(int)i])
      {
        //p.add(index++,(int)i);
        primes[index++]=(int)i;
        for(long j=i*i;j<=n;j+=i)
        {
          prime[(int)j]=false;
        }
      }
    }
  }
                                
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int k=0;
    int val=primes[0];
    //System.out.println(p.size());
    
    while(val<=n)
    {
      //if(k%100==1)
      //{
        val=primes[k];
        out.println(val);
      //}
      
      k+=100;
    }
    //out.flush();
  }
  
}
    