import java.util.Scanner;
public class EULER42
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int ans=0;
      for(int i=999;i>=100;i--)
      {
        for(int j=999;j>=100;j--)
        {
          
          if(palindrome(i*j)&&(i*j)>ans&&(i*j)<n)
          {
            ans=i*j;
          }
          
        }
      }
      System.out.println(ans);
    }
  }
    public static boolean palindrome(int n)
    {
      int duplicate=n;
      int rev=0;
      while(n>0)
      {
        rev=(rev*10)+n%10;
        n/=10;
      }
      if(rev==duplicate) return true;
      else return false;
    }
  }

              
              