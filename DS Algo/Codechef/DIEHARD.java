import java.util.Scanner;
public class DIEHARD
{
  static int dp[][];
  public static void main(String[] args)
  {
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      dp=new int[10000][10000];
      int H=sc.nextInt();
      int A=sc.nextInt();
      //System.out.println(solve(H+3,A+2,1)+1);
      //System.out.println(solve(2,7,1));
      //System.out.println(solve(9,5,2));
      //System.out.println(solve(14,15,1));
      //System.out.println(solve(11,13,3));
      //System.out.println(solve(31,8,1));
      int ans=Math.max(1+solve(H+3,A+2,1),Math.max(solve(H-5,A-10,2)+1,1+solve(H-20,A+5,3)));
      //System.out.println(solve(H+3,A+2,1)+1);
      System.out.println(ans);
    }
  }
  public static int solve(int health, int armour, int previous)
  {
    if(health<=0||armour<=0) return -1;
    else if(dp[health][armour]!=0) return dp[health][armour];
    else
    {
      int ans;
      if(previous==1)
      {
       ans=Math.max(1+solve(health-5,armour-10,2),1+solve(health-20,armour+5,3));
      }
      else if(previous==2)
      {
        ans=Math.max(1+solve(health+3,armour+2,1),1+solve(health-20,armour+5,3));
      }
      else
      {
        ans=Math.max(1+solve(health+3,armour+2,1),1+solve(health-5,armour-10,2));
      }
      dp[health][armour]=ans;
      return ans;
    }
  }
}
                             
                             ;
      
    
    
    