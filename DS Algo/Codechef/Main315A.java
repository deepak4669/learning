import java.util.Scanner;
import java.util.Arrays;
public class Main315A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean[][] opened=new boolean[2][1001];
    Arrays.fill(opened[0],false);
    Arrays.fill(opened[1],false);
    int[] a=new int[n];
    int ans=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      int b=sc.nextInt();
      opened[0][a[i]]=true;
      if(a[i]!=b&&!opened[1][b])
      {
        opened[1][b]=true;
      }
    }
    for(int i=0;i<n;i++)
    {
      if(!opened[1][a[i]])
        ans++;
    }
        
      
      
    
   
    System.out.println(ans);
  }
}
    
        
        