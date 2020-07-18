import java.util.*;
public class MinuteToWinIT
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      b[i]=a[i];
    }
    
    int ans1=0;
    int ans2=0;
    int ans;
    if(b[1]-b[0]!=d)
    {
      b[0]=b[1]-d;
      ans1++;
    }
    for(int i=0;i<n-1;i++)
    {
      if((b[i+1]-b[i])!=d)
      {
        b[i+1]=(b[i]+d);
        ans1++;
      }
    }
  
    for(int i=0;i<n-1;i++)
    {
      if((a[i+1]-a[i])!=d) 
      {
        a[i+1]=(a[i]+d);
        ans2++;
      }
    }
    if(ans1>ans2) ans = ans2;
    else ans = ans1;
    System.out.println(ans);
  }
}
          
        
                      