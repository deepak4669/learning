import java.util.*;
import java.io.*;

class C1
{
  static PrintWriter out=new PrintWriter(System.out);
  
  static class dat implements Comparable<dat>
  {
    char ch;
    public dat(char c)
    {
      this.ch=c;
    }
    public int compareTo(dat that)
    {
      String s=this.ch+"";
      String t=that.ch+"";
      if((Integer.parseInt(s)==2&&Integer.parseInt(t)==0)||(Integer.parseInt(s)==0&&Integer.parseInt(t)==2))
        return 0;
      else
      {
        if(Integer.parseInt(s)<Integer.parseInt(t)) return -1;
        else if(Integer.parseInt(s)>Integer.parseInt(t)) return +1;
        else return 0;
      }
    }
  }
      
        
        
        
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    dat[] a=new dat[s.length()];
    for(int i=0;i<s.length();i++)
      a[i]=new dat(s.charAt(i));
    Arrays.sort(a);
    for(int i=0;i<s.length();i++)
      out.print(a[i].ch);
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

