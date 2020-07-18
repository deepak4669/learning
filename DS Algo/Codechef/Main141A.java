import java.util.*;
import java.io.*;

public class Main141A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String p=sc.next();
    String q=sc.next();
    String s=sc.next();
    boolean[] marked=new boolean[s.length()];
    Arrays.fill(marked,false);
    
    boolean t1=false;
    boolean t2=false;
    for(int i=0;i<p.length();i++)
    {
      t1=false;
      for(int j=0;j<s.length();j++)
      {
        if((s.charAt(j)==p.charAt(i))&&!marked[j])
        {
          marked[j]=true;
          t1=true;
          break;
        }
      }
      if(!t1)
        break;
    }
    for(int i=0;i<q.length();i++)
    {
      t2=false;
      for(int j=0;j<s.length();j++)
      {
        if((s.charAt(j)==q.charAt(i))&&!marked[j])
        {
          marked[j]=true;
          t2=true;
          break;
        }
      }
      if(!t2)
        break;
    }
    boolean t3=true;
    for(int i=0;i<marked.length;i++)
    {
      if(!marked[i])
      {
        t3=false;
      }
    }
    if(t1&&t2&&t3)
      out.println("YES");
    else
      out.println("NO");
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

