import java.util.*;
import java.io.*;

class Main12086
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int k=0;
    while(true)
    {
      k++;
      int n=sc.nextInt();
      
      if(n==0) break;
      if(k>1) out.println();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      BIT bit=new BIT(a,n);
      out.println("Case "+k+":");
      while(true)
      {
        String s=sc.next();
        if(s.equals("END")) break;
        if(s.substring(0,1).equals("M"))
        {
          int x=sc.nextInt();
          int y=sc.nextInt();
          out.println(bit.query(y)-
                      bit.query(x-1));
        }
        else
        {
          int x=sc.nextInt();
          int r=sc.nextInt();
          bit.update(x,r-a[x-1]);
          a[x-1]=r;
        }
      }
      
    }
    out.flush();
                        
        
    
  }
  static class BIT
  {
    int[] BIT;
    int n;
    public BIT(int[] a,int n)
    {
      BIT=new int[n+1];
      this.n=n;
      for(int i=1;i<=n;i++)
        update(i,a[i-1]);
    }
    public void update(int x, int val)
    {
      for(;x<=n;x+=(x&-x))
        BIT[x]+=val;
    }
    public int query(int x)
    {
      int sum=0;
      for(;x>0;x-=(x&-x))
        sum+=BIT[x];
      return sum;
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

