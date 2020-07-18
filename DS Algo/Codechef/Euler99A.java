import java.math.BigInteger;
import java.io.*;
import java.util.*;
public class Euler99A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    BigInteger max=new BigInteger("0");
    String[] s=new String[22000];
    for(int i=0;i<22000;i++)
      s[i]=sc.next();
    for(int i=0;i<22000;i++)
    {
//      System.out.println("s");
//      String s=sc.nextLine();
      String[] numbers=s[i].split(",");
      BigInteger b=new BigInteger(numbers[0]);
      int e=Integer.parseInt(numbers[1]);
      BigInteger c=b.pow(e);
      if(max.compareTo(c)<0)
        max=c;
    }
    System.out.println(max);
  }
}
      