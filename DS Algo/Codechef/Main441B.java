import java.util.Scanner;
public class Main441B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int v=sc.nextInt();
    int[] f=new int[30001];
    for(int i=0;i<n;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      f[a]+=b;
    }
    int ans=0;
    int prev=0;
    for(int i=1;i<=3000;i++)
    {
      int rem=prev+f[i];
      if(rem>v)
      {
        if(prev>v)
        {
          ans+=v;
          prev=f[i];
        }
        else if(prev<v)
        {
          ans+=v;
          prev=(prev+f[i])-v;
        }
        else
        {
          ans+=v;
          prev=f[i];
        }
      }
      else if(rem<v)
      {
        ans+=rem;
        prev=0;
      }
      else
      {
        ans+=v;
        prev=0;
      }
    }
    ans+=prev>=v?v:prev;
    System.out.println(ans);
  }
}
          