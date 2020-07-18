import java.util.*;
import java.io.*;
//267630EY
public class MainCM4
{
  static PrintWriter out=new PrintWriter(System.out);
  static int[][] a;
  static int n;
  static int[] row;
  static long ans2=0;
  static void backtrack(int c)
  {
    
    if(c==n)
    {
      long val=0;
      for(int i=0;i<n;i++)
      {
        val+=a[i][row[i]];
      }
      ans2=Math.max(ans2,val);
      return ;
      
    }
    for(int r=0;r<n;r++)
    {
     
      if(canPlace(r,c))
      {
        row[c]=r;
        backtrack(c+1);
      }
    }
  }
  static boolean canPlace(int r,int c)
  {
    for(int p=0;p<c;p++)
    {
      if(row[p]==r)
        return false;
    }
    return true;
  }
        
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a=new int[n][n];
    row=new int[n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
    }
   
    backtrack(0);
    
    out.println(ans2);
    
    out.flush();
    
    
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

