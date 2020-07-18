import java.util.Scanner;
public class Main276A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int  ans=-1000000000;
    for(int i=0;i<n;i++)
    {
      int f=sc.nextInt();
      int t=sc.nextInt();
      int fun;
      if(t>k)
        fun=f-(t-k);
      else 
        fun=f;
      if(fun>ans) ans=fun;
    }
    System.out.println(ans);
  }
}