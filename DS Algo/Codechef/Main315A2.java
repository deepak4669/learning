import java.util.Scanner;
public class Main315A2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //boolean[] marked=new boolean[1001];
    int[][] marked=new int[n][2];
    int[] b=new int[n];
    for(int i=0;i<n;i++)
    {
      marked[i][0]=sc.nextInt();
      b[i]=sc.nextInt();
      
    }
    int ans=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(marked[j][0]==b[i]&&i!=j)
          marked[j][1]=1;
      }
    }
    for(int i=0;i<n;i++)
    {
      if(marked[i][1]==0)
        ans++;
    }
    System.out.println(ans);
  }
}
