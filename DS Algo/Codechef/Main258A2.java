import java.util.Scanner;
public class Main258A2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    if(k==0)
    {
      for(int i=1;i<=n;i++)
        System.out.print(i+" ");
    }
    else
    {
      for(int i=n;i>=(n-k+1);i--)
        System.out.print(i+" ");
      for(int i=1;i<=n-k;i++)
        System.out.print(i+" ");
    }
  }
}