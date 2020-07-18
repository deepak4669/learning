import java.util.Scanner;
public class Main441A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int money=sc.nextInt();
    int[] ans=new int[n];
    int h=0;
    for(int i=1;i<=n;i++)
    {
      int k=sc.nextInt();
      boolean flag=false;
      
      for(int j=0;j<k;j++)
      {
        int x=sc.nextInt();
        if(x<money)
        {
          flag=true;
        }
      }
      if(flag)
        ans[h++]=i;
    }
    System.out.println(h);
    for(int i=0;i<h;i++)
      System.out.print(ans[i]+" ");
    
  }
}
      
      