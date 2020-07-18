import java.util.*;
import java.io.*;
//267630EY
public class Main79B
{
  static PrintWriter out=new PrintWriter(System.out);
  static class pair implements Comparable<pair>
  {
    int a;
    int b;
    public pair(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public int compareTo(pair that)
    {
      if(this.a<that.a) return -1;
      else if(this.a>that.a) return +1;
      else if(this.b<that.b) return -1;
      else if(this.b>that.b) return +1;
      else return 0;
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    int t=sc.nextInt();
    pair[] a=new pair[k];
    for(int i=0;i<k;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      a[i]=new pair(x,y);
    }
    Arrays.sort(a);
    for(int i=0;i<t;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      int cnt=0;
      boolean flag=false;
      for(int j=0;j<k;j++)
      {
        if(a[j].a>x||(a[j].a==x&&a[j].b>y))
          break;
        else if(a[j].a==x&&a[j].b==y)
        {
          flag=true;
          break;
        }
        else
          cnt++;
      }
      if(flag)
        out.println("Waste");
      else
      {
        int id=(x-1)*m+y;
        String ans;
        id-=cnt;
        if(id%3==0)
        {
          out.println("Grapes");
        }
        else if(id%3==1)
          out.println("Carrots");
        else
          out.println("Kiwis");
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

