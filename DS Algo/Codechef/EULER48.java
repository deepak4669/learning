import java.util.Scanner;
import java.math.BigInteger;
public class EULER48
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    BigInteger f=BigInteger.ZERO;
    int k=1;
    while(k<=1000)
    {
      BigInteger n=BigInteger.valueOf(k).pow(k);
      f=f.add(n);
      k++;
    }
    String s=f.toString();
    String ans=s.substring(s.length()-10,s.length());
    System.out.println(ans);
  }
}