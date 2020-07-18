import java.util.Scanner;
public class Main239A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int y=sc.nextInt();
    int k=sc.nextInt();
    int n=sc.nextInt();
    int x_up=n-y;
    if(x_up==0) System.out.println(-1);
    else
    {
      if(k>y)
      {
        if(k%y==0)
        {
          int l=k-y;
          
          //System.out.println(l);
          int cnt=0;
          int t=0;
          while((l)*1+t*k+y<=n)
          {
            cnt++;
            //System.out.println(-1);
            System.out.print((l)*1+t*k+" ");
            t++;
          }
          if(cnt==0)
            System.out.println(-1);
        }
        else
        {
          int v=k-y;
          int cnt=0;
          int t=0;
          while(v+t*k+y<=n)
          {
            cnt++;
            System.out.print(v+t*k+" ");
            t++;
          }
          if(cnt==0)
            System.out.println(-1);
        }
      }
      else
      {
          
      if(y%k==0)
      {
        int t=1;
        int cnt=0;
        while(y+t*k<=n)
        {
          cnt++;
          System.out.print(t*k+" ");
          t++;
        }
        if(cnt==0) System.out.println(-1);
      }
      else
      {
        int l=k-y%k;
        int t=0;
        int cnt=0;
        while((l+t*k+y)<=n)
        {
          cnt++;
          System.out.print(l+t*k+" ");
          t++;
        }
        if(cnt==0)
          System.out.println(-1);
      }
    }
  }
}
}      