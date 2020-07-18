import java.util.*;
import java.io.*;
public class TABGAME2
{
  public static void main(String[] args) throws IOException
  {
    PrintWriter out=new PrintWriter(System.out);
    Scanner sc=new Scanner(System.in);
    //Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    while(p-->0)
    {
      
      String s=sc.nextLine();
      String t=sc.nextLine();
      int n=t.length();
      assert n>=1;
      int m=s.length();
      assert m>=1;
      
      
      char ans[][]=new char[n+1][m+1];
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=m;j++)
        {
          if(i-1==0&&j-1==0)
          {
            //System.out.println(s.charAt(i-1)+" "+t.charAt(i-1));
            if(s.charAt(0)=='0'||t.charAt(0)=='0')
            {
              //System.out.println("s");
              
              ans[i][j]='A';
              //System.out.println(ans[i][j]);
            }
            else
              ans[i][j]='B';
          }
          else if(i-1==0)
          {
            assert (j-1)!=0;
            if(s.charAt(j-1)=='0'||ans[i][j-1]=='B')
              ans[i][j]='A';
            else
              ans[i][j]='B';
          }
          else if(j-1==0)
          {
            assert (i-1)!=0;
            if(t.charAt(i-1)=='0'||ans[i-1][j]=='B')
            {
              ans[i][j]='A';
              //System.out.println(ans[i][j]);
            }
            else
              ans[i][j]='B';
          }
          else
          {
            if(ans[i-1][j]=='B'||ans[i][j-1]=='B')
              ans[i][j]='A';
            else
              ans[i][j]='B';
          }
          
        }
      }
      int q=sc.nextInt();
      for(int i=0;i<q;i++)
      {
        int x=sc.nextInt();
        int y=sc.nextInt();
        //System.out.println(x+" "+y);
        System.out.print((ans[x][y]=='A'?1:0));
      }
      if(q>0)
        System.out.println();
      //out.flush();
    }
  }
 static class Scanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public Scanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }
}
        
          
              