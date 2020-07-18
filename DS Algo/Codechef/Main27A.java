import java.util.Scanner;
public class Main27A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[3002];
    for(int i=0;i<n;i++)
    {
      int s=sc.nextInt();
      a[s]=1;
    }
    int ans=0;
    for(int i=1;i<=3001;i++)
    {
      if(a[i]==0)
      {
        ans=i;
        break;
      }
    }
    System.out.println(ans);
  }
}