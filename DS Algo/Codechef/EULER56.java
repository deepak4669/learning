import java.util.Scanner;
import java.math.BigInteger;
public class EULER56
{
  static long sum_num(BigInteger b)
  {
    BigInteger z=new BigInteger("0");
    long sum=0;
    while(b.compareTo(z)>0)
    {
      sum+=(b.mod(BigInteger.valueOf(10))).intValue();
      b=b.divide(BigInteger.valueOf(10));
    }
    return sum;
  }
  
      
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long max=0;
    for(int i=1;i<100;i++)
    {
      BigInteger f=new BigInteger(""+i);
      for(int j=1;j<100;j++)
      {
        BigInteger g=new BigInteger(""+j);
        BigInteger h=f.pow(j);
        long sum=sum_num(h);
        if(sum>max)
          max=sum;
      }
    }
    System.out.println(max);
  }}
    