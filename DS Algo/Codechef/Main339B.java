import java.util.Scanner;
public class Main339B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long m=sc.nextLong();
    long[] a=new long[(int)m];
    for(int i=0;i<m;i++)
      a[i]=sc.nextLong();
    long ans=0;
    long current=1;
    
    for(int i=0;i<m;i++)
    {
      if(a[i]>current)
      {
        ans+=(a[i]-current);
        current=a[i];
      }
      else if(a[i]<current)
      {
        ans+=(n-current)+a[i];
        current=a[i];
      }
      else
      {
        ans+=0;
        current=a[i];
      }
    }
    System.out.println(ans);
  }
}
        
        
        
   
  