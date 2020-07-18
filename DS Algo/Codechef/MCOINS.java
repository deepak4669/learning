import java.util.*;
public class MCOINS
{
  static int[][] dp;
  static int k,l;
  public static void main(String[] args)
  {
    dp=new int[2][1000001];
    for(int[] row:dp)
      Arrays.fill(row,-1);
    Scanner sc=new Scanner(System.in);
    
    k=sc.nextInt();
    l=sc.nextInt();
    
    int m=sc.nextInt();
    String s="";
    
    for(int i=0;i<m;i++)
    {
      int n=sc.nextInt();
     //0 indicates B chance 1 indicates A chance
       if(solve(k,l,n-1,0)||solve(k,l,n-k,0)||solve(k,l,n-l,0))
         s+="A";
       else s+="B";
       
    }
    System.out.println(s);
  }
  public static boolean solve(int a, int b,int n, int ch)
  {
    if(n<=0) return false;
    else if(n==1&&ch==0) return true;
    else if(n==1&&ch==1) return false;
    else if(dp[ch][n]!=-1) return dp[ch][n]==0?false:true;
    else
    {
      boolean ans;
      if(ch==1)//A chancel
      {
        if(solve(a,b,n-a,0)||solve(a,b,n-b,0)||solve(a,b,n-1,0))
          ans=true;
        else
          ans=false;
      }
      else
      {
        if(solve(a,b,n-a,1)||solve(a,b,n-b,1)||solve(a,b,n-1,1))
          ans=true;
        else
          ans=false;
      }
      dp[ch][n]=ans?1:0;
      return ans;
    }
  }
}
  
    
    
    
    
      