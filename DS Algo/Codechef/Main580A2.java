import java.util.Scanner;
public class Main580A2{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int[] dp=new int[100001];
    for(int i=0;i<n;i++)
      dp[i]=1;
    for(int i=1;i<n;i++)
    {
      if(a[i]>=a[i-1])
        dp[i]=dp[i-1]+1;
    }
    int result=1;
    for(int i=0;i<n;i++)
      result=result>dp[i]?result:dp[i];
    System.out.println(result);
  }
}
      
                     