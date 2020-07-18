import java.util.Scanner;
public class Main11
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[] res=new int[t];
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      res[i]=noSquares(n);
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(res[i]);
    }
  }
  public static int noSquares(int n)
  {
    int res=0;
    for(int i=1;i<=n;i++)
    {
      res+=i*i;
    }
    return res;
  }
}