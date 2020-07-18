import java.util.*;
import java.io.*;
//267630EY
public class Main810B
{
  static PrintWriter out=new PrintWriter(System.out);
  public static class set implements Comparable<set>
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
      int x=Math.min(that.a,that.b*2)-Math.min(that.a,that.b);
      int y=Math.min(this.a,this.b*2)-Math.min(this.a,this.b);
      if(x>y) return -1;
      else if(x<y) return +1;
      //else if(this.b<that.b) return -1;
      //else if(this.b>that.b) return 1;
      else return 0;
    }
  }
      
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=sc.nextInt();
    set[] a=new set[n];
    for(int i=0;i<n;i++)
    {
      int k=sc.nextInt();
      int l=sc.nextInt();
      a[i]=new set(l,k);
    }
    Arrays.sort(a);
    long ans=0;
    for(int i=n-1;i>=0;i--)
    {
      //System.out.println(ans);
      if(a[i].a>a[i].b)
      {
        if(f>0)
        {
          ans+=(long)Math.min(a[i].a,a[i].b*2);
          f--;
        }
        else
          ans+=(long)a[i].b;
      }
      else
      {
        ans+=(long)a[i].a;
      }
    }
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

