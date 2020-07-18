import java.util.*;
import java.io.*;

class Main357B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] x=new int[m];
    int[] y=new int[m];
    int[] z=new int[m];
    int[] a=new int[n+1];
    int[] color=new int[n+1];
    for(int i=0;i<m;i++)
    {
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
      z[i]=sc.nextInt();
      a[x[i]]++;
      a[y[i]]++;
      a[z[i]]++;
      if(a[x[i]]==1&&a[y[i]]==1&&a[z[i]]==1)
      {
        color[x[i]]=1;
        color[y[i]]=2;
        color[z[i]]=3;
      }
      else if(a[x[i]]>1)
      {
        assert a[y[i]]==1&&a[z[i]]==1;
        if(color[x[i]]==1)
        {
          color[y[i]]=2;
          color[z[i]]=3;
        }
        else if(color[x[i]]==2)
        {
          color[y[i]]=1;
          color[z[i]]=3;
        }
        else
        {
          color[y[i]]=2;
          color[z[i]]=1;
        }
      }
      else if(a[y[i]]>1)
      {
        assert a[x[i]]==1&&a[z[i]]==1;
        if(color[y[i]]==1)
        {
          color[x[i]]=2;
          color[z[i]]=3;
        }
        else if(color[y[i]]==2)
        {
          color[x[i]]=1;
          color[z[i]]=3;
        }
        else
        {
          color[x[i]]=2;
          color[z[i]]=1;
        }
      }
      else if(a[z[i]]>1)
      {
        assert a[y[i]]==1&&a[x[i]]==1;
        if(color[z[i]]==1)
        {
          color[y[i]]=2;
          color[x[i]]=3;
        }
        else if(color[z[i]]==2)
        {
          color[y[i]]=1;
          color[x[i]]=3;
        }
        else
        {
          color[y[i]]=2;
          color[x[i]]=1;
        }
      }
    }
    for(int i=1;i<=n;i++)
      out.print(color[i]+" ");
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

