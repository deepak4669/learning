import java.util.Scanner;
public class Main118B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++)
    {
      for(int j=0;j<(2*n-2*i);j++)
        System.out.print(" ");
      for(int k=0;k<=i;k++)
      {
        if(k==i&&i==0)
          System.out.print(k);
        else
          System.out.print(k+" ");
      }
      for(int k=i-1;k>=0;k--)
      {
        if(k==0)
          System.out.print(k);
        else
          System.out.print(k+" ");
      }
      System.out.println();
    }
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=2*i;j++)
        System.out.print(" ");
      for(int k=0;k<=(n-i);k++)
      {
        if(k==(n-i)&&k==0) System.out.print(k);
        else
          System.out.print(k+" ");
      }
      for(int k=n-i-1;k>=0;k--)
      {
        if(k==0)
          System.out.print(k);
        else
          System.out.print(k+" ");
      }
      System.out.println();
    }
  }
}
        
  
