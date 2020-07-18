import java.util.Scanner;
public class Main30
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int k=0;
    double n;
    int[] res=new int[1000];
    
    while(true)
    {
      n=sc.nextDouble();
      if(n==0.00) break;
      res[k++]=ans(n);
    }
    for(int i=0;i<k;i++)
    {
      System.out.print(res[i]);
      System.out.println(" card(s)");
    }
  }
  public static int ans(double a)
  {
    double sum=0.0;
    int k=0;
    for(int i=2; ;i++)
    {
      k++;
      sum+=(1.0/(i));
      if(sum>=a) return k;
    }
  }
}
      