import java.util.Scanner;
public class TOANDFRO
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    while(true)
    {
      int n=sc.nextInt();
      if(n==0) break;
      sc.nextLine();
      String s=sc.nextLine();
      char[][] arr=new char[s.length()/n][n];
      int k=0;
      for(int i=0;i<(s.length()/n);i++)
      {
        if(i%2==0)
        {
          for(int j=0;j<n;j++)
          {
            arr[i][j]=s.charAt(k);
            k++;
          }
        }
        else
        {
          for(int j=n-1;j>=0;j--)
          {
            arr[i][j]=s.charAt(k);
            k++;
          }
        }
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<s.length()/n;j++)
          System.out.print(arr[j][i]);
      }
      System.out.println();
    }
  }
}
          