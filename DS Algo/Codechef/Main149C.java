import java.util.*;
import java.io.*;
//267630EY
public class Main149C
{
  static PrintWriter out=new PrintWriter(System.out);
  static class set implements Comparable<set>
  {
    int a;
    int b;
    public set(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public int compareTo(set that)
    {
      if(this.a<that.a) return -1;
      else if(this.a>that.a) return +1;
      else return 0;
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    set[] a=new set[n];
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      a[i]=new set(x,i+1);
    }
    Arrays.sort(a);
    Vector<Integer> first=new Vector<Integer>();
    Vector<Integer> second=new Vector<Integer>();
    for(int i=0;i<n;i++)
    {
      if(i%2==0)
      {
        first.add(a[i].b);
      }
      else
        second.add(a[i].b);
    }
    out.println(first.size());
    for(int j:first)
      out.print(j+" ");
    out.println();
    out.println(second.size());
    for(int k:second)
      out.print(k+" ");
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

