import java.util.Scanner;
public class Main7
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    long[] res=new long[t];
    for(int i=0;i<t;i++)
    {
      long a=sc.nextInt();
      res[i]=sumDivisor(a);
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(res[i]);
    }
  }
  public static long sumDivisor(long a)
  {
    long res=0;
    if(a==1) return 0;
    
    for(long i=2;i*i<=a;i++)
    {
      if(a==i*i) res+=i;
      else{
        if(a%i==0) res+=(i+a/i);}
      
    }
    return res+1;
  }
  
  
}