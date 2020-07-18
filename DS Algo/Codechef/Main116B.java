import java.util.Scanner;
public class Main116B
{
  static int n,m;
  static boolean[][] mat;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    mat=new boolean[n][m];
    String[] s=new String[n];
    for(int i=0;i<n;i++)
      s[i]=sc.next();
    int count=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        if(s[i].charAt(j)=='P')
        {
          if(check(i-1,j))
          {
            if(s[i-1].charAt(j)=='W'&&!mat[i-1][j])
            {
              count++;
              mat[i-1][j]=true;
              continue;
            }
          }
          if(check(i+1,j))
          {
            if(s[i+1].charAt(j)=='W'&&!mat[i+1][j])
            {
              count++;
              mat[i+1][j]=true;
              continue;
            }
          }
          if(check(i,j-1))
          {
            if(s[i].charAt(j-1)=='W'&&!mat[i][j-1])
            {
              count++;
              mat[i][j-1]=true;
              continue;
            }
          }
          if(check(i,j+1))
          {
            if(s[i].charAt(j+1)=='W'&&!mat[i][j+1])
            {
              count++;
              mat[i][j+1]=true;
              continue;
            }
          }
        }
      }
    }
    System.out.println(count);
  }
  public static boolean check(int i, int j)
  {
    return 0<=i&&i<n&&0<=j&&j<m;
  }
  
}
        
     