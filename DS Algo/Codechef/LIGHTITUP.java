import java.util.Scanner;
public class LIGHTITUP
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int M=sc.nextInt();
    int[] a=new int[n+2];
    for(int i=1;i<n+1;i++)
      a[i]=sc.nextInt();
    a[n+1]=M;
    int[][] f=new int[2][n+2];
    for(int i=n;i>=0;i--)
    {
      f[0][i]=f[1][i+1];
      f[1][i]=a[i+1]-a[i]+f[0][i+1];
    }
    int ans=f[1][0];
    for(int i=0;i<=n;i++)
    {
      if(a[i+1]-a[i]<2) continue;
      int tp=pred(i);
      int psum=f[1][0]-f[tp][i];
      ans=Math.max(ans,psum+(a[i+1]-a[i]-1)+ f[tp][i+1]);
    }
    System.out.println(ans);
  }
  public static int pred(int n)
  {
    if(n%2==0) return 1;
    else return 0;
  }
      
      
}
      