import java.util.Scanner;
public class Main450B
{
  //static long[] dp=new long[1000001];
  static long f=1000000007;
  static long x;
  static long y;
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    x=sc.nextLong();
    y=sc.nextLong();
    long n=sc.nextLong();
    long ans=0;
    if(n%6==1)
      ans=mod(x,f);
    else if(n%6==2)
      ans=mod(y,f);
    else if(n%6==3)
      ans=mod(y-x,f);
    else if(n%6==4)
      ans=mod(-x,f);
    else if(n%6==5)
      ans=mod(-y,f);
    else
      ans=mod(-y+x,f);
    
    
    System.out.println(ans);
  }
  
  public static long mod(long a,long b)
  {
    return ((a%b)+b)%b;
  }
    
  
}