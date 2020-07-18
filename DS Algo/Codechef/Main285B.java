import java.util.Scanner;
import java.util.Arrays;
public class Main285B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=sc.nextInt();
    int t=sc.nextInt();
    int[] a=new int[n+1];
    boolean[] visited=new boolean[n+1];
    for(int i=1;i<=n;i++)
      a[i]=sc.nextInt();
    Arrays.fill(visited,false);
    //visited[s]=true;
    if(s==t) System.out.println(0);
    else
    {
      boolean flag=true;
      int ans=0;
      while(s!=t)
      {
        if(visited[s])
        {
          flag=false;
          break;
        }
        else
        {
          visited[s]=true;
          s=a[s];
          ans++;
        }
      }
      if(flag) System.out.println(ans);
      else
        System.out.println(-1);
    }
  }
      
    
}
