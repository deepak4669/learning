import java.math.BigInteger;
import java.util.Scanner;
public class EULER20
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      
      BigInteger f=BigInteger.ONE;
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        f=f.multiply(BigInteger.valueOf(i));
      }
    String s=f.toString();
    int ans=0;
    for(int i=0;i<s.length();i++)
    {
      ans+=Integer.parseInt(s.substring(i,i+1));
    }
    System.out.println(ans);
    }
  }
    
}
  