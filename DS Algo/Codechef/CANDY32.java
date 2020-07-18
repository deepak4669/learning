import java.util.Scanner;
public class CANDY32
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      long sum=0;
      for(int j=0;j<n;j++)
      {
        int m=sc.nextInt();
        sum=(sum+m)%n;
      }
      if(sum==0) System.out.println("YES");
      else System.out.println("NO");
    }
  }
}
        
    
      