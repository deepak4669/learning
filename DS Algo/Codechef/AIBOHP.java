import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class AIBOHP
{
  static String s;
  static int[][] dp;
  
  public static void main(String[] args) throws IOException
  {
    FastReader sc=new FastReader();
    int t=sc.nextInt();
    while(t-->0)
    {
      s=sc.nextLine();
      dp=new int[s.length()][s.length()];
      int ans=solve(0,s.length()-1);
      System.out.println(ans);
    }
  }
  public static int solve(int i,int j)
  {
    if(i==j) return 0;
    else if((j-i)==1){
      if(s.charAt(i)==s.charAt(j)) return 0;
      else return 1;
    }
    else if(dp[i][j]!=0) return dp[i][j];
    else
    {
      int ans;
      if(s.charAt(i)==s.charAt(j))
        ans=solve(i+1,j-1);
      else
        ans=Math.min(solve(i,j-1),solve(i+1,j)) +1;
      dp[i][j]=ans;
      return ans;
    }
  }
   static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
      