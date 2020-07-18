import java.util.Scanner;
import java.util.HashMap;
import java.math.BigInteger;
public class EULER25
{
  static HashMap<Integer,BigInteger> map=new HashMap<Integer,BigInteger>();
  static int[] a=new int[5001];
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int t=sc.nextInt();
    while(t-->0)
    {      
      int n=sc.nextInt();
      System.out.println(a[n]);
    }
    
  }
  public static boolean getDigitCount(int n,BigInteger number) {
  double factor = Math.log(2) / Math.log(10);
  int digitCount = (int) (factor * number.bitLength() + 1);
  if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
    digitCount= digitCount - 1;
  }
  return digitCount==n?true:false;
}
  public static int ans(int n)
  {
    BigInteger a=fib(1);
    int k=1;
    while(!getDigitCount(n,a))
    {
      a=fib(k);
      k++;
    }
    return k;
  }
  public static BigInteger fib(int n)
  {
    if(n==1) return BigInteger.valueOf(1);
    else if(n==2) return BigInteger.valueOf(2);
    else if(map.containsKey(n)) return map.get(n);
    else
    {
      map.put(n,fib(n-1).add(fib(n-2)));
      return map.get(n);
    }
  }
  public static void preprocess()
  {
    for(int i=2;i<=5000;i++)
    {
      a[i]=ans(i);
    }
  }
}
            
    
    
    
  