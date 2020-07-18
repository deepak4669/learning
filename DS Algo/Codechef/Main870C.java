import java.util.*;
import java.io.*;

class Main870C
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    int ans[]=new int[16];
    Arrays.fill(ans,-1);
    ans[0]=0;
    Vector<Integer> val=new Vector<Integer>();
    val.add(4);
    val.add(6);
    val.add(9);
    for(int i=1;i<16;i++)
    {
      for(int j:val)
      {
        if(i>=j&&ans[i-j]>=0)
        {
          ans[i]=Math.max(ans[i],ans[i-j]+1);
        }
      }
    }
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    for(int i=0;i<q;i++)
    {
      int n=sc.nextInt();
      if(n<16)
        out.println(ans[n]);
      else
      {
        int t=(n-16)/4+1;
        int ans2=t+ans[n-4*t];
        out.println(ans2);
      }
    }
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
