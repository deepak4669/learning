import java.util.*;
import java.io.*;

class MATSUM
{
  static PrintWriter out=new PrintWriter(System.out);
  static long[][] BIT;
  static int n;
  
  public static void update(int x,int y, long num)
  {
    for(int i=x;i<=n;i+=(i&-i))
    {
      for(int j=y;j<=n;j+=(j&-j))
        BIT[i][j]+=num;
    }
  }
  public static long query(int x1, int y1, int x2, int y2)
  {
    return query(x2,y2)-query(x1-1,y2)-query(x2,y1-1)+query(x1-1,y1-1);
  }
  public static long query(int x,int y)
  {
    int res=0;
    for(int i=x;i>0;i-=(i&-i))
    {
      for(int j=y;j>0;j-=(j&-j))
        res+=BIT[i][j];
    }
    return res;
  }
  
      
  
  
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      n=sc.nextInt();
      long[][] a= new long[n][n];
      BIT=new long[n+1][n+1];
      while(true)
      {
        String s=sc.next();
        if(s.equals("END")) break;
        if(s.equals("SET"))
        {
          int x=sc.nextInt();
          int y=sc.nextInt();
          long num=sc.nextLong();
          
          update(x+1,y+1,num-a[x][y]);
          a[x][y]=num;
        }
        else
        {
          int x1=sc.nextInt();
          int y1=sc.nextInt();
          int x2=sc.nextInt();
          int y2=sc.nextInt();
          out.println(query(x1+1,y1+1,x2+1,y2+1));
        }
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

