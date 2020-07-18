import java.util.*;
import java.io.*;

class Main437A
{
  static PrintWriter out=new PrintWriter(System.out);
  public static class obj implements Comparable<obj>
  {
    String s;
    int len;
    public obj(int len,String s)
    {
      this.s=s;
      this.len=len;
    }
    public int compareTo(obj that)
    {
      if(this.len<that.len) return -1;
      else if(this.len>that.len) return +1;
      else return 0;
    }
  }
      
    
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    obj[] a=new obj[4];
    for(int i=0;i<4;i++)
    {
      String s=sc.next();
      a[i]=new obj(s.length()-2,s.substring(0,1));
    }
    Arrays.sort(a);
    String ans="";
    int x=2*a[0].len;
    int y=a[3].len;
    
    
    if(x<=a[1].len&&x<=a[2].len&&x<=a[3].len&&!(y>=2*a[0].len&&y>=2*a[1].len&&y>=2*a[2].len))
      ans+=a[0].s;
    else if(y>=2*a[0].len&&y>=2*a[1].len&&y>=2*a[2].len&&!(x<=a[1].len&&x<=a[2].len&&x<=a[3].len))
      ans+=a[3].s;
    else
      ans+="C";
    out.println(ans);
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

