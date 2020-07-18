import java.util.Scanner;
public class Main460B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int cnt=0;
    long[] sol=new long[1000000];
    for(int i=1;i<=81;i++)
    {
      long med=(b*(long)Math.pow(i,a))+(long)c;
      //System.out.println(med);
      int sum=0;
      long n=med;
      while(n>0)
      {
        sum+=(n%10);
        n/=10;
      }
      if(sum==i&&med<1000000000)
      {
        //System.out.println(med
        sol[cnt++]=med;
      }
    }
    System.out.println(cnt);
    for(int i=0;i<cnt;i++)
    {
      System.out.print(sol[i]+" ");
    }
  }
}
      
      
    